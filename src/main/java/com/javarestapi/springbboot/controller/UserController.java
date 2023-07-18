package com.javarestapi.springbboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javarestapi.springbboot.entities.User;
import com.javarestapi.springbboot.services.UserServicesImpl;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserServicesImpl userServicesImpl;
	
	@GetMapping(value = "/", produces="application/json")
	public String Home() {
		System.out.println("Home page");
		String userJson = "{\"Hello\"}";
		return userJson;
	}	
	
	
	/*
	 * User Registration 
	 */
	@PostMapping(value = "/register", produces = "application/json")
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String Register(@RequestBody User newUser) {
		System.out.println("Register page");
		String message = userServicesImpl.createUser(newUser);
		String jsonMessage = "{\"message\":\""+ message +"\"}";
		return jsonMessage;
	}
}
