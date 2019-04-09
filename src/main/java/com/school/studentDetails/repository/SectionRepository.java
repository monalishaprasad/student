package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Section;

public interface SectionRepository extends JpaRepository<Section, Integer> {

}
