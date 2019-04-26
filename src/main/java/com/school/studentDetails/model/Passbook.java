package com.school.studentDetails.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASSBOOK")
public class Passbook implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	private int id;
	
	private String date;
	private long repaidAmount;
	private long outstandingBalance;

	
	
	public String getDate() {
		return date;
	}

	public void setDate(String string) {
		this.date = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getRepaidAmount() {
		return repaidAmount;
	}

	public void setRepaidAmount(long repaidAmount) {
		this.repaidAmount = repaidAmount;
	}

	public long getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(long outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	@Override
	public String toString() {
		return "Passbook [id=" + id + ", date=" + date + ", repaidAmount=" + repaidAmount + ", outstandingBalance="
				+ outstandingBalance + "]";
	}

	

}
