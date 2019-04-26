package com.school.studentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentDetails.Service.PassbookService;
import com.school.studentDetails.model.Passbook;

@RestController
@RequestMapping(value="/passbookController")
public class PassbookController {

	@Autowired
	private PassbookService passbookService ;
	
	@PostMapping
	public Passbook postPassbook(@RequestBody Passbook passbook) {
		
		Passbook postIntoPassbook = passbookService.addPassbook(passbook);
		
		return postIntoPassbook;
	}
}
