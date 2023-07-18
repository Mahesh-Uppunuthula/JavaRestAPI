package com.javarestapi.springbboot.services;

import com.javarestapi.springbboot.entities.User;

public interface UserServices {
	String createUser(User user);
	String loginUser(User user);
}
