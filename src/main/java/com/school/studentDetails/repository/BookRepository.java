package com.school.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.studentDetails.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
