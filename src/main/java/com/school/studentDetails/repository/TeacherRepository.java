package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	
}
