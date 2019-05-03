package com.school.studentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.LoanServices;
import com.school.studentDetails.dto.LoanDTO;
import com.school.studentDetails.model.Loan;

@RestController
@RequestMapping(value = "/loan/")
public class LoanController {

	@Autowired
	private LoanServices loanService;

	@PostMapping
	public LoanDTO loans(@RequestBody LoanDTO loanDto) {

		LoanDTO postloan = loanService.createLoan(loanDto);

		return postloan;

	}

	@GetMapping
	public List<Loan> getLoans() {

		List<Loan> gettingloan = loanService.findLoan();

		return gettingloan;

	}

	@GetMapping("/{id}")
	public Loan getLoanById(@PathVariable int id) {

		return loanService.getLoanById(id);
	}

	/*
	 * @PutMapping public Loan updatePassbook(@RequestBody Loan loan) {
	 * 
	 * Loan updatePassbook = loanService.updatePassbook(loan); return
	 * updatePassbook;
	 * 
	 * }
	 */

}
