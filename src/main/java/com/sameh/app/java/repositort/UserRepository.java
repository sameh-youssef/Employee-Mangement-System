package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.UserTest;

public interface UserRepository extends JpaRepository<UserTest, Integer> {
	
}
