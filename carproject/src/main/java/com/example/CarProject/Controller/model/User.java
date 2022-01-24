package com.example.CarProject.Controller.model;

import org.springframework.stereotype.Component;
 
public class User {

 
	private String user_name;
	private int age;
	private int user_id;
	private String gender;
	private String address;
	private String role;
	private String password;
	
public User() {
		
	}

	public User(String user_name, int age, int user_id, String gender, String address, String role, String password) {
		super();
		this.user_name = user_name;
		this.age = age;
		this.user_id = user_id;
		this.gender = gender;
		this.address = address;
		this.role = role;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
 
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
