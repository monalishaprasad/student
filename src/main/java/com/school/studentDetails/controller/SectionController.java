package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.SectionService;
import com.school.studentDetails.model.Section;

@RestController
@RequestMapping(value="/sectionController")
public class SectionController {
	
	@Autowired
	private SectionService sectionService;

	@PostMapping
	public Section postSection(@RequestBody Section section) {
		
		Section addtoSection = sectionService.addSection(section);
		
		return addtoSection;
		
	}
}
