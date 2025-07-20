package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Resource;

public interface Resource_repo extends JpaRepository<Resource,Integer>{
    
}
