package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Lecture_dto;
import com.priyansh.spring.RespDto.Lecture_Resp_dto;
import com.priyansh.spring.model.Lecture;

public class Lecture_mapperTest {

    private Lecture_mapper lecture_mapper;

    @BeforeEach
    void setup(){
        lecture_mapper = new Lecture_mapper();
        System.out.println("run succcesfully");
    }

    @Test
    void testLecture_resp_dto() {
        //Given
        Lecture_dto lecture_dto = new Lecture_dto("priyansh");

        //when

        Lecture lecture = lecture_mapper.leecture(lecture_dto);

        //then
        Assertions.assertEquals(lecture_dto.name(), lecture.getName());

    }

    @Test
    void testLeecture() {
        //Given
        Lecture lecture = new Lecture("priyanshu", null, null);

        //when
        Lecture_Resp_dto lecture_Resp_dto = lecture_mapper.lecture_resp_dto(lecture);

        //then
        Assertions.assertEquals(lecture.getName(), lecture_Resp_dto.name());

    }
}
