package com.javarestapi.springbboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@Entity(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String email;
	private String password;
}
