package com.example.CarProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.CarProject.Controller.model.User;
@Service
public class RegistrationService {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	 
		
 
		public String insertUser(User u) {
			
			System.out.println("inside service" +u.getAddress());
			
			System.out.println(jdbcTemplate);			
			int i=jdbcTemplate.update("INSERT INTO user VALUES(?,?,?,?,?,?,?)",u.getUser_id(),u.getUser_name(),u.getAge(),u.getGender(),u.getAddress(),u.getRole(),u.getPassword());
			System.out.println(i);
			if(i>0) {
			System.out.println(u.getUser_name());
				return u.getPassword();
			}
	 
				return null;
				
		}
}


//@Service
//public class RegistrationService {
//	@Autowired
//	RegistrationDaoImpl registrationDaoImpl;
//
//	public Boolean insertUser(int user_id,String user_name,int age,String gender,String address,String role,String password){
//		
//		return registrationDaoImpl.registerUser(user_name,age,gender,address,role,password);
//	}
//}

