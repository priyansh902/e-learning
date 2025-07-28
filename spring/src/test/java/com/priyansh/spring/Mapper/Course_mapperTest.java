package com.priyansh.spring.Mapper;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Course_dto;
import com.priyansh.spring.RespDto.Course_Resp_dto;
import com.priyansh.spring.model.Course;

public class Course_mapperTest {

    private Course_mapper course_mapper;

    @BeforeEach
    void setup(){
        course_mapper = new Course_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testCoourse() {
        //Given
        Course_dto course_dto = new Course_dto("Math", "learn math");

        //when
        Course course = course_mapper.coourse(course_dto);

        //Then
        Assertions.assertEquals(course_dto.title(), course.getTitle());
        Assertions.assertEquals(course_dto.description(), course.getDescription());

    }

    @Test
    void testCourse_dto() {
        //Given
        Course course = new Course("math", "learn math", null, null);

        //When
        Course_Resp_dto course_Resp_dto = course_mapper.course_dto(course);


        //Then
        Assertions.assertEquals(course.getTitle(), course_Resp_dto.title());
        Assertions.assertEquals(course.getDescription(), course_Resp_dto.description());


    }
}
