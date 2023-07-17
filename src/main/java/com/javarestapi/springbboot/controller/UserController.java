package com.javarestapi.springbboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@GetMapping("/")
	public String Home() {
		System.out.println("Home page");
		return "Home page";
	}
	
	
}
