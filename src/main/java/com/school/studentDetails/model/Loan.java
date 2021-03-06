package com.school.studentDetails.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN")
public class Loan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	private int id;
	private String loanReason;
	private double loanAmount;
	private double interestAmount;
	private double totalPaybackAmount;
	private double paidAmount;
	
	private String createdOn;
	private String modifiedOn;
	private boolean active = true;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "LoanId")
	private List<Passbook> passbook;

	@Column(name = "STUDENT_ID")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String string) {
		this.createdOn = string;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String string) {
		this.modifiedOn = string;
	}

	@Override
	public String toString() {
		return String.format(
				"Loan [id=%s, loanReason=%s, loanAmount=%s, interestAmount=%s, totalPaybackAmount=%s, paidAmount=%s, dues=%s, createdOn=%s, modifiedOn=%s, active=%s, passbook=%s, studentId=%s]",
				id, loanReason, loanAmount, interestAmount, totalPaybackAmount, paidAmount, createdOn, modifiedOn,
				active, passbook, studentId);
	}

	
}
