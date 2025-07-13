package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Author;

public interface Author_repo extends JpaRepository<Author, Integer> {

    
}