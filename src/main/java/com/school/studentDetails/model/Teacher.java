package com.school.studentDetails.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacherId", unique = true, nullable = false)
	private int id;
	private String teacherName;
	private String teacherSub;

	@OneToOne(cascade= CascadeType.ALL)
	private PersonalDetails teacherDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSub() {
		return teacherSub;
	}

	public void setTeacherSub(String teacherSub) {
		this.teacherSub = teacherSub;
	}

	public PersonalDetails getTeacherDetails() {
		return teacherDetails;
	}

	public void setTeacherDetails(PersonalDetails teacherDetails) {
		this.teacherDetails = teacherDetails;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", teacherSub=" + teacherSub + ", teacherDetails="
				+ teacherDetails + "]";
	}

}
