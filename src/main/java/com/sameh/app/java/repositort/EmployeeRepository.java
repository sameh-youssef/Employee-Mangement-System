package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
