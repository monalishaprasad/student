package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.PersonalDetailsService;
import com.school.studentDetails.model.PersonalDetails;

@RestController
@RequestMapping(value="/personalDetailsController")
public class PersonalDetailsController {
	
	@Autowired
	private PersonalDetailsService personalDetailsService;
	
	@PostMapping
	public PersonalDetails addPersonalDetail(@RequestBody PersonalDetails personalDetail) {
		
		PersonalDetails addThePersonalDetails = personalDetailsService.addPersonalDetails(personalDetail);
	
		return addThePersonalDetails;
		
		
	}
	

}
