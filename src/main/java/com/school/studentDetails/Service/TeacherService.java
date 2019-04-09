package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Teacher;
import com.school.studentDetails.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;

	public Teacher addTeacher(Teacher teacher) {

		Teacher addingTeacher = teacherRepo.save(teacher);
		
		return addingTeacher;
	}
	
	
	
}
