package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{
	
}
