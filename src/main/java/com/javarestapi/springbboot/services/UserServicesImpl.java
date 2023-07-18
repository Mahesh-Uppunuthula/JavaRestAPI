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
		 * check if the user already exists with same credentials
		 * if no user exists create one
		 * otherwise send message
		 * */
		userRepo.save(user);
		return "Registration successful";
	}

	@Override
	public String loginUser(User user) {
		return null;
	}
	
}
