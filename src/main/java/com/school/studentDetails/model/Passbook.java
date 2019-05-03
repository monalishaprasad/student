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
	
	private String modifiedOnDate;
	private double repaidAmount;
	private double outstandingBalance;

	
	
	public String getModifiedOnDate() {
		return modifiedOnDate;
	}

	public void setModifiedOnDate(String string) {
		this.modifiedOnDate = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRepaidAmount() {
		return repaidAmount;
	}

	public void setRepaidAmount(double repaidAmount) {
		this.repaidAmount = repaidAmount;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public double setOutstandingBalance(double outstandingBalance) {
		return this.outstandingBalance = outstandingBalance;
	}

	@Override
	public String toString() {
		return "Passbook [id=" + id + ", date=" + modifiedOnDate + ", repaidAmount=" + repaidAmount + ", outstandingBalance="
				+ outstandingBalance + "]";
	}

	

}
