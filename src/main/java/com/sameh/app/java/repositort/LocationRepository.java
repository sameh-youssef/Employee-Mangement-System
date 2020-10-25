package com.sameh.app.java.repositort;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameh.app.java.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{
}
