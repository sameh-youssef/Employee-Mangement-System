package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.JobApplicant;

public interface JobApplicantRepository extends JpaRepository<JobApplicant, Integer> {

}
