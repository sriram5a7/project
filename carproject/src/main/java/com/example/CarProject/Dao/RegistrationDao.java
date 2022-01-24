package com.example.CarProject.Dao;

public interface RegistrationDao {
	
	public Boolean insertUser(int user_id,String user_name,int age,String gender,String address,String role,String password);

}
