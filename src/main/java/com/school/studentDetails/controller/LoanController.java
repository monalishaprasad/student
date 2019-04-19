package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.LoanServices;
import com.school.studentDetails.model.Loan;

@RestController
@RequestMapping(value = "/loanController")
public class LoanController {

	@Autowired
	private LoanServices loanService;

	@PostMapping
	public Loan loans(@RequestBody Loan loan) {

		Loan postloan = loanService.addloan(loan);

		return postloan;

	}
}
