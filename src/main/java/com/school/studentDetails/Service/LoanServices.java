package com.school.studentDetails.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Loan;
import com.school.studentDetails.model.Passbook;
import com.school.studentDetails.repository.LoanRepository;

@Service
public class LoanServices {

	@Autowired
	private LoanRepository loanRepo;

	Passbook passbook = new Passbook();

	public Loan createLoan(Loan loan) {
		
		//get loan amt and interest
		//sum them
		double totalPaybackAmount = loan.getLoanAmount() + loan.getInterestAmount();
		
		//set total payback
		loan.setTotalPaybackAmount(totalPaybackAmount);
		
		//set totalrepaid = 0
		loan.setPaidAmount(0);
		
		//set dues
		loan.setDues(loan.getTotalPaybackAmount());
		
		//set the date on which the loan was created
		
		LocalDateTime todaysDate = LocalDateTime.now();
		loan.setCreatedOn(todaysDate);
		
		Loan loans = loanRepo.saveAndFlush(loan);
		
		return loans;

	}

	public List<Loan> findLoan() {

		List<Loan> getloan = loanRepo.findAll();

		return getloan;
	}

	public Loan getLoanById(int id) {
		Loan loan = loanRepo.getOne(id);
		return loan;
	}

	public Loan doUpdatePassbook(Loan loan) {

		
		double paidAmount = 0;
		long outstandingBalance = 0;
		double dues=0;
		

		paidAmount = loan.getPaidAmount() + passbook.getRepaidAmount();
		loan.setPaidAmount(paidAmount);

		outstandingBalance = passbook.getOutstandingBalance() - passbook.getRepaidAmount();
		passbook.setOutstandingBalance(outstandingBalance);
		
		dues= passbook.getOutstandingBalance()-loan.getPaidAmount();
		loan.setDues(dues);

		if (passbook.getOutstandingBalance() == 0) {
			loan.setActive(false);
		}
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		
		passbook.setDate((dtf.format(localDate)));

		Loan loans = loanRepo.save(loan);

		return loans;
	}
}
