package com.school.studentDetails.dto;

import javax.persistence.OneToOne;

import com.school.studentDetails.model.PersonalDetails;

public class TeacherDTO {

	private int id;
	private String teacherName;
	private String teacherSub;

	@OneToOne
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
		return String.format("TeacherDTO [id=%s, teacherName=%s, teacherSub=%s, teacherDetails=%s]", id, teacherName,
				teacherSub, teacherDetails);
	}

}
