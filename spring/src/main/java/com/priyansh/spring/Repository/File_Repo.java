package com.priyansh.spring.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.File;

public interface File_Repo extends JpaRepository<File, Integer> {
    
}
