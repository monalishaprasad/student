package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Loan;
import com.school.studentDetails.repository.LoanRepository;

@Service
public class LoanServices {

	@Autowired
	private LoanRepository loanRepo;

	public Loan addloan(Loan loan) {

		Loan postingLoan = loanRepo.save(loan);

		return postingLoan;
	}
}
