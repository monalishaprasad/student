package com.school.studentDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentDetails.model.Section;
import com.school.studentDetails.repository.SectionRepository;

@Service
public class SectionService {
	@Autowired
	private SectionRepository sectionRepo;

	public Section addSection(Section section) {

		Section addingSection = sectionRepo.save(section);

		return addingSection;
	}

}
