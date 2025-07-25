package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Course_dto;
import com.priyansh.spring.Mapper.Course_mapper;
import com.priyansh.spring.Repository.Course_repo;
import com.priyansh.spring.RespDto.Course_Resp_dto;
import com.priyansh.spring.model.Course;

@Service
public class Course_service {
    private final Course_mapper course_mapper;

    private final Course_repo course_repo;

    public Course_service(Course_mapper course_mapper,Course_repo course_repo){
        this.course_mapper = course_mapper;
        this.course_repo = course_repo;
    }

    public Course_Resp_dto saveCourse(Course_dto course_dto){
        var course = course_mapper.coourse(course_dto);
        var saved = course_repo.save(course);
        return course_mapper.course_dto(saved);
    }

    public List<Course> getCourse(){
        return course_repo.findAll();
    }

    public void delete(Integer id){
          course_repo.deleteById(id);
    }

    public Course tocourse(Course course){
       return course_repo.save(course);
    }
}
