package com.javarestapi.springbboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javarestapi.springbboot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByEmail(User user);
	Boolean existsByEmail(String email);
}
