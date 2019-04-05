package com.school.studentDetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sectionId", unique = true, nullable = false)
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
		return "Section [id=" + id + ", numberOfStudents=" + numberOfStudents + ", numberOfBenches=" + numberOfBenches
				+ "]";
	}

}
