package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.TeacherService;
import com.school.studentDetails.model.Teacher;

@RestController
@RequestMapping(value="/teacherController")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	@PostMapping
	public Teacher postTeacher(@RequestBody Teacher teacher) {
		
		Teacher postTeacher = teacherService.addTeacher(teacher);
		
		return postTeacher;	
		
	}

}
