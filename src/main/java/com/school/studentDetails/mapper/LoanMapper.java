package com.school.studentDetails.mapper;

import org.springframework.stereotype.Component;

import com.school.studentDetails.dto.LoanDTO;
import com.school.studentDetails.model.Loan;

@Component
public class LoanMapper {

	// loan to loandto and loandto to loan
	// 2 methods

	public Loan loanDtoToLoan(LoanDTO loanDto) {

		Loan loan = new Loan();

		// get loandto field data and set to loanfield
		loan.setActive(loanDto.isActive());
		loan.setCreatedOn(loanDto.getCreatedOn());
		loan.setId(loanDto.getId());
		loan.setInterestAmount(loanDto.getInterestAmount());
		loan.setLoanAmount(loanDto.getLoanAmount());
		loan.setLoanReason(loanDto.getLoanReason());
		loan.setModifiedOn(loanDto.getModifiedOn());
		loan.setPaidAmount(loanDto.getPaidAmount());
		loan.setPassbook(loanDto.getPassbook());
		loan.setStudentId(loanDto.getStudentId());
		loan.setTotalPaybackAmount(loanDto.getTotalPaybackAmount());

		return loan;

	}

	public LoanDTO loanToLoanDTO(Loan loan) {

		LoanDTO loanDto = new LoanDTO();

		loanDto.setLoanAmount(loan.getLoanAmount());
		loanDto.setActive(loan.isActive());
		loanDto.setCreatedOn(loan.getCreatedOn());
		loanDto.setId(loan.getId());
		loanDto.setInterestAmount(loan.getInterestAmount());
		loanDto.setLoanReason(loan.getLoanReason());
		loanDto.setPassbook(loan.getPassbook());
		loanDto.setModifiedOn(loan.getModifiedOn());
		loanDto.setPaidAmount(loan.getPaidAmount());
		loanDto.setStudentId(loan.getStudentId());
		loanDto.setTotalPaybackAmount(loan.getTotalPaybackAmount());

		return loanDto;

	}

}
