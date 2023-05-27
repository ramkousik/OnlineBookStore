package com.assignment.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
