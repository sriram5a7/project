package com.example.CarProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarProject.Controller.model.User;
import com.example.CarProject.service.RegistrationService;

@RestController
public class RegistrationController {
	
	
	@Autowired
	RegistrationService regService;
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")
	public String registerUser(@RequestBody User u) { 
		
		System.out.println(u.getUser_id());
		String uname=null;
		
		try {
		uname=regService.insertUser(u);
		
		 System.out.println(uname);
		return uname;
			
			
		}
		catch (Exception e) {
			 
		}
		

		return uname;
		
}
}
