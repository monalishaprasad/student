package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.VehicleService;
import com.school.studentDetails.model.Vehicle;

@RestController
@RequestMapping(value="/vehicleController")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		
		Vehicle addingVehicle = vehicleService.addVehicle(vehicle);
		
		return addingVehicle;
		
	}

}
