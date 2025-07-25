package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Lecture_dto;
import com.priyansh.spring.RespDto.Lecture_Resp_dto;
import com.priyansh.spring.model.Lecture;

@Service
public class Lecture_mapper {
    public Lecture leecture(Lecture_dto lecture_dto){
        var lecture = new Lecture();
        lecture.setName(lecture_dto.name());

        return lecture;
    }

    public Lecture_Resp_dto lecture_resp_dto(Lecture lecture){
        return new Lecture_Resp_dto(lecture.getName());
    }
}
