package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Course;

public interface Course_repo extends JpaRepository<Course,Integer> {
    
}
