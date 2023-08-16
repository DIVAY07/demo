package com.project.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.example.demo.entities.User;
import com.project.example.demo.repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
	
	public User createUser(User user)
	{
		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
	
}
