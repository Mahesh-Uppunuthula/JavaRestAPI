package com.javarestapi.springbboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarestapi.springbboot.entities.User;
import com.javarestapi.springbboot.repositories.UserRepository;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public String createUser(User user) {
		/**
		 * validate email and password
		 * check if the user already exists with same credentials
		 * if no user exists create one
		 * otherwise send message
		 * */
		
		if(user.getEmail() == null || user.getPassword() == null) {
			return "empty fields, User Registraion Failed";
		}
		
		
		//checking if user already exists
		boolean isUserExists = userRepo.existsByEmail(user.getEmail());
		
		if(isUserExists) return "User already exists";
		
		
		
		userRepo.save(user);
		return "Registration successful";
	}

	@Override
	public String loginUser(User user) {
		return null;
	}
	
}
