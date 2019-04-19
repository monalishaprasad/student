package com.school.studentDetails.model;

import java.util.List;

import javax.persistence.CascadeType;
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

	private String name;
	private int rollNumber;

	@OneToOne(cascade = CascadeType.ALL)
	private Book book;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Vehicle> vehicle;

	@ManyToOne(cascade = CascadeType.ALL)
	private Section section;

	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDetails studentDetails;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Teacher> teacher;

	@OneToMany
	@JoinColumn(name = "STUDENT_ID")
	private List<Loan> loan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", book=" + book + ", vehicle="
				+ vehicle + ", section=" + section + ", studentDetails=" + studentDetails + ", teacher=" + teacher
				+ ", loan=" + loan + "]";
	}

}
