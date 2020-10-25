package com.sameh.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameh.app.java.repositort.AdminRepository;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private AdminRepository adminRepository;
	
	
	
}
