package com.example.CarProject.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.CarProject.Dao.RegistrationDao;

@Component
public class RegistrationDaoImpl implements RegistrationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Boolean insertUser(int user_id,String user_name,int age,String gender,String address,String role,String password) {
		int flag;
		try {
			flag=jdbcTemplate.update("insert into users values(?,?,?,?,?,?,?,?,?)", user_id,user_name,age,gender,address,role,password);
			if(flag>0)
				return true;
		}
		catch (Exception e) {
			return true;
		}
		
		return false;
	}
}
