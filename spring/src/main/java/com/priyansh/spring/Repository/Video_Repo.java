package com.priyansh.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.spring.model.Video;

public interface Video_Repo extends JpaRepository<Video, Integer> {
    
}
