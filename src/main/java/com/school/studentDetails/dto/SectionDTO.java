package com.school.studentDetails.dto;

public class SectionDTO {

	private int id;
	private int numberOfStudents;
	private int numberOfBenches;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getNumberOfBenches() {
		return numberOfBenches;
	}

	public void setNumberOfBenches(int numberOfBenches) {
		this.numberOfBenches = numberOfBenches;
	}

	@Override
	public String toString() {
		return String.format("SectionDTO [id=%s, numberOfStudents=%s, numberOfBenches=%s]", id, numberOfStudents,
				numberOfBenches);
	}

}
