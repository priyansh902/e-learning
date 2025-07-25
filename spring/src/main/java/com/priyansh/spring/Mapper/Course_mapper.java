package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Course_dto;
import com.priyansh.spring.RespDto.Course_Resp_dto;
import com.priyansh.spring.model.Course;

@Service
public class Course_mapper {
    
    public Course coourse(Course_dto course_dto){
        var course = new Course();
        course.setTitle(course_dto.title());
        course.setDescription(course_dto.description());

        return course;
    }

    public Course_Resp_dto course_dto(Course course){
        return new Course_Resp_dto(course.getTitle(), course.getDescription());
    }

   

}
