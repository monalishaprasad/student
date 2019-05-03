package com.school.studentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.dto.LoanDTO;
import com.school.studentDetails.mapper.LoanMapper;
import com.school.studentDetails.model.Loan;
import com.school.studentDetails.model.Passbook;
import com.school.studentDetails.repository.LoanRepository;

@Service
public class LoanServices {

	@Autowired
	private LoanRepository loanRepo;

	@Autowired
	private LoanMapper loanMapper;

	Passbook passbook = new Passbook();

	public LoanDTO createLoan(LoanDTO loanDto) {

		Loan loan = loanMapper.loanDtoToLoan(loanDto);

		loan = loanRepo.saveAndFlush(loan);// .... jo chiz save hua hai wo data aaega save kre k bad.

		loanDto = loanMapper.loanToLoanDTO(loan);// ye us data to dto me convert krne k liye.

		// calculate totalPaybackAmount

		double totalPaybackAmount = loanDto.getLoanAmount() + loanDto.getInterestAmount();
		loanDto.setTotalPaybackAmount(totalPaybackAmount);

		// set dues //
		loanDto.setDues(loanDto.getTotalPaybackAmount());

		return loanDto;

	}

	public List<Loan> findLoan() {

		List<Loan> getloan = loanRepo.findAll();

		return getloan;
	}

	public Loan getLoanById(int id) {
		Loan loan = loanRepo.getOne(id);
		return loan;
	}

	/*
	 * public Loan updatePassbook(Loan loan) {
	 * 
	 * if(loan.isActive()) { List<Passbook> passbook = loan.getPassbook(); if
	 * (passbook != null) { double totalRepaidAmount = 0.00; for (Passbook item :
	 * passbook) { if (item.getOutstandingBalance() == 0) {
	 * item.setOutstandingBalance(loan.getDues() - item.getRepaidAmount());
	 * 
	 * } DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	 * LocalDate localDate = LocalDate.now();
	 * item.setModifiedOnDate(dtf.format(localDate));
	 * loan.setModifiedOn(dtf.format(localDate)); totalRepaidAmount =
	 * totalRepaidAmount + item.getRepaidAmount(); }
	 * 
	 * loan.setPaidAmount(totalRepaidAmount);
	 * loan.setDues(loan.getTotalPaybackAmount() - loan.getPaidAmount()); }
	 * 
	 * // set loan as inactive if no dues if (loan.getDues() == 0) {
	 * loan.setActive(false); } }
	 * 
	 * 
	 * 
	 * Loan loans = loanRepo.save(loan);
	 * 
	 * return loans; }
	 */

}
