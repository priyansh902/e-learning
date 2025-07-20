package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Lecture_dto;
import com.priyansh.spring.model.Lecture;

@Service
public class Lecture_mapper {
    public Lecture leecture(Lecture_dto lecture_dto){
        var lecture = new Lecture();
        lecture.setName(lecture.getName());

        return lecture;
    }

    public Lecture_dto lecture_dto(Lecture lecture){
        return new Lecture_dto(lecture.getName());
    }
}
