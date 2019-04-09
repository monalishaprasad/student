package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.PersonalDetails;
import com.school.studentDetails.repository.PersonalDetailsRepository;

@Service
public class PersonalDetailsService {
	
	@Autowired
	PersonalDetailsRepository personalDetailRepo;

	public PersonalDetails addPersonalDetails(PersonalDetails personalDetail) {
		
		PersonalDetails addingPersonalDetails = personalDetailRepo.save(personalDetail);

		return addingPersonalDetails;
	}
	

}
