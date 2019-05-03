package com.school.studentDetails.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.school.studentDetails.model.Passbook;

public class LoanDTO {

	private int id;
	private String loanReason;
	private double loanAmount;
	private double interestAmount;
	private double totalPaybackAmount;
	private double paidAmount;
	private double dues;
	private String createdOn;
	private String modifiedOn;
	private boolean active = true;

	@OneToMany
	private List<Passbook> passbook;

	private int studentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanReason() {
		return loanReason;
	}

	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getTotalPaybackAmount() {
		return totalPaybackAmount;
	}

	public void setTotalPaybackAmount(double totalPaybackAmount) {
		this.totalPaybackAmount = totalPaybackAmount;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getDues() {
		return dues;
	}

	public void setDues(double dues) {
		this.dues = dues;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Passbook> getPassbook() {
		return passbook;
	}

	public void setPassbook(List<Passbook> passbook) {
		this.passbook = passbook;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return String.format(
				"LoanDTO [id=%s, loanReason=%s, loanAmount=%s, interestAmount=%s, totalPaybackAmount=%s, paidAmount=%s, dues=%s, createdOn=%s, modifiedOn=%s, active=%s, passbook=%s, studentId=%s]",
				id, loanReason, loanAmount, interestAmount, totalPaybackAmount, paidAmount, dues, createdOn, modifiedOn,
				active, passbook, studentId);
	}

}
