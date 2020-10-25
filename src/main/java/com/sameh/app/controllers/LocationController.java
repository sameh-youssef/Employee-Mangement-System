package com.sameh.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameh.app.java.model.Location;
import com.sameh.app.java.repositort.LocationRepository;

@RestController
@RequestMapping("admin/location")
public class LocationController {

	@Autowired
	private LocationRepository locationRepository;
	
	@GetMapping
	public List<Location> getLocation(){
		return locationRepository.findAll();
	}
	@PostMapping
	public String createLocation(Location location) {
		locationRepository.save(location);
		return location.toString();
	}
	
	@PutMapping
	public String updateLocation(Location location) {
		locationRepository.save(location);
		return location.toString();
	}
	
}
