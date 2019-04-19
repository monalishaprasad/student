package com.school.studentDetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	private int id;
	private String loanReason;
	private long loanAmount;
	private double interest;
	private double totalPaybackAmount;
	private long paidAmount;
	private long dues;
	
	@Column(name="STUDENT_ID")
	private int studentId;
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
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
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getTotalPaybackAmount() {
		return totalPaybackAmount;
	}
	public void setTotalPaybackAmount(double totalPaybackAmount) {
		this.totalPaybackAmount = totalPaybackAmount;
	}
	public long getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(long paidAmount) {
		this.paidAmount = paidAmount;
	}
	public long getDues() {
		return dues;
	}
	public void setDues(long dues) {
		this.dues = dues;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", loanReason=" + loanReason + ", loanAmount=" + loanAmount + ", interest=" + interest
				+ ", totalPaybackAmount=" + totalPaybackAmount + ", paidAmount=" + paidAmount + ", dues=" + dues
				+ ", studentId=" + studentId + "]";
	}

	

}
