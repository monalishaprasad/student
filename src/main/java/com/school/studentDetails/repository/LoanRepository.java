package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
