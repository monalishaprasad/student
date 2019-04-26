package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Student;

public interface StudentRespository extends JpaRepository<Student, Integer> {
	


}
