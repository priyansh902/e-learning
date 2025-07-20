package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Text;

public interface Text_repo extends JpaRepository<Text, Integer> {

    
}
