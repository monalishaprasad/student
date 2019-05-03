package com.school.studentDetails.dto;

public class PersonalDetailsDTO {

	private int id;
	private String emailAddress;
	private long phoneNo;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("PersonalDetailsDTO [id=%s, emailAddress=%s, phoneNo=%s, address=%s]", id, emailAddress,
				phoneNo, address);
	}

}
