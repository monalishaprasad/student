package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.PersonalDetails;


public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Integer> {

}
