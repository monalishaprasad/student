package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
