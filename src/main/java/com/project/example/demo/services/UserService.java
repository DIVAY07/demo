package com.project.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.example.demo.models.User;

@Service
public class UserService {
	public List<User>store = new ArrayList<>();
	
	public UserService()
	{
		store.add(new User(UUID.randomUUID().toString(), "Divay" , "divay@mail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Dhoni" , "dhoni@mail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Ashwin" , "Ashwin@mail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Raina" , "Raina@mail.com"));
	}
	
	public List<User>getUsers()
	{
		return this.store;
	}

}
