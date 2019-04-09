package com.school.studentDetails.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "STUDENT")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	int id;

	@ManyToMany
	@JoinColumn(insertable=false,updatable=false)
	private List<Teacher> teacher;
	
	@Column(name="l")
	private int teacherId;

	@OneToOne
	private Book book;

	@OneToMany
	private List<Vehicle> vehicle;

	@ManyToOne
	private Section section;

	@OneToOne
	private PersonalDetails studentDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PersonalDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(PersonalDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public PersonalDetails getPersonalDetails() {
		return studentDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.studentDetails = personalDetails;
	}

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + ", book=" + book + ", vehicle=" + vehicle + ", section=" + section
				+ ", personalDetails=" + studentDetails + "]";
	}

}
