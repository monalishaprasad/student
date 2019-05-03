package com.school.studentDetails.dto;

public class PassbookDTO {

	private String modifiedOnDate;
	private double repaidAmount;
	private double outstandingBalance;

	public String getModifiedOnDate() {
		return modifiedOnDate;
	}

	public void setModifiedOnDate(String modifiedOnDate) {
		this.modifiedOnDate = modifiedOnDate;
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

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	@Override
	public String toString() {
		return String.format("PassbookDTO [modifiedOnDate=%s, repaidAmount=%s, outstandingBalance=%s]", modifiedOnDate,
				repaidAmount, outstandingBalance);
	}

}
