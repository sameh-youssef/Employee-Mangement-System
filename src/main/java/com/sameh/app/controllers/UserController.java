package com.sameh.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameh.app.java.model.UserTest;
import com.sameh.app.java.repositort.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserRepository repository;
	@GetMapping
	public List<UserTest> getUsers(){
		return repository.findAll();
	}
	@PostMapping
	public void saveUser(@RequestBody UserTest user) {
		System.out.println(user);
		repository.save(user);
	}
}
