/**
 * 
 */
package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Passbook;

/**
 * @author mprasad
 *
 */
public interface PassbookRepository extends JpaRepository<Passbook, Integer> {

}
