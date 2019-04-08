package com.school.studentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Student;
import com.school.studentDetails.repository.StudentRespository;

@Service
public class StudentService {

	@Autowired
	private StudentRespository studentRepo;

	public Student addStudentDetails(Student student) {

		Student students = studentRepo.save(student);

		return students;
	}

	public List<Student> getStudentDetails() {
	
		List<Student> getStudent = studentRepo.findAll();
		
		return getStudent;
	}

}
