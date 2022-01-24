package com.example.CarProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarProject.Controller.model.Order;
import com.example.CarProject.Controller.model.User;
import com.example.CarProject.service.RegistrationService;

@RestController
public class OrderCreationController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostMapping("/createOrder")
	@CrossOrigin(origins="http://localhost:4200")
	public boolean registerUser(@RequestBody Order o) { 
		
		
		
		try {
		

			System.out.println(jdbcTemplate);			
			int i=jdbcTemplate.update("INSERT INTO orders VALUES(?,?,?)",o.getOrder_id(),o.getSeries_id(),o.getModel_id());
			System.out.println(i);
			if(i>0) {
			//System.out.println(u.getUser_name());
				return true;
			}
			
		}
		catch (Exception e) {
			 
		}
		
        return false;
		
}
	
	
	

}
