package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Vehicle;
import com.school.studentDetails.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepo;

	public Vehicle addVehicle(Vehicle vehicle) {
		
		Vehicle addintoVehicle = vehicleRepo.save(vehicle);
		return addintoVehicle;
	}

}
