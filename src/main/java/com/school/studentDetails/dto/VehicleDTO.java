package com.school.studentDetails.dto;

public class VehicleDTO {

	private int id;
	private String vehicleNumber;
	private String vehicleType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return String.format("VehicleDTO [id=%s, vehicleNumber=%s, vehicleType=%s]", id, vehicleNumber, vehicleType);
	}

}
