package com.school.studentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.StudentService;
import com.school.studentDetails.model.Student;

@RestController
@RequestMapping(value = "/studentController")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping 
	public Student postStudent(@RequestBody Student student) {

		Student students = studentService.addStudentDetails(student);

		return students;
		
	}	
	
	
	@GetMapping
	public List <Student> students(){
		
		List<Student> studentsList = studentService.getStudentDetails();
		
		return studentsList;
		

	}

}
