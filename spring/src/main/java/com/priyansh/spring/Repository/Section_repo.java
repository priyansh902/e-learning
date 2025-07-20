package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Section;

public interface Section_repo extends JpaRepository<Section,Integer>{
    
}
