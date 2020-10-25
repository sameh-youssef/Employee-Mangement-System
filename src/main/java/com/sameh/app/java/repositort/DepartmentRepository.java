package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
