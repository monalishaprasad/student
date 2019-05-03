package com.school.studentDetails.dto;

import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.school.studentDetails.model.Book;
import com.school.studentDetails.model.Loan;
import com.school.studentDetails.model.PersonalDetails;
import com.school.studentDetails.model.Section;
import com.school.studentDetails.model.Teacher;
import com.school.studentDetails.model.Vehicle;

public class StudentDTO {

	private String studentName;
	private int rollNumber;

	@OneToOne
	private Book book;

	@OneToMany
	private List<Vehicle> vehicle;

	@ManyToOne
	private Section section;

	@OneToOne
	private PersonalDetails studentDetails;

	@ManyToMany
	private List<Teacher> teacher;

	@OneToMany
	private List<Loan> loan;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
		return String.format(
				"StudentDTO [studentName=%s, rollNumber=%s, book=%s, vehicle=%s, section=%s, studentDetails=%s, teacher=%s, loan=%s]",
				studentName, rollNumber, book, vehicle, section, studentDetails, teacher, loan);
	}

	
}
