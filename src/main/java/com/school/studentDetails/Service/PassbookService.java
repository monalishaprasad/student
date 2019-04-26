package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Passbook;
import com.school.studentDetails.repository.PassbookRepository;

@Service
public class PassbookService {

	@Autowired
	private PassbookRepository passbookRepo;
	public Passbook addPassbook(Passbook passbook) {
		
		Passbook passbookRecord = passbookRepo.save(passbook);
		
		return passbookRecord;
	}

	
	
	
	
}
