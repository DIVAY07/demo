package com.project.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.example.demo.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	public Optional<User> findByEmail(String email);
}
