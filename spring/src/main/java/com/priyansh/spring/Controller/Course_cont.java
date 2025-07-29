package com.priyansh.spring.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.spring.Dto.Course_dto;
import com.priyansh.spring.RespDto.Course_Resp_dto;
import com.priyansh.spring.Service.Course_service;
import com.priyansh.spring.model.Course;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Course_cont {
    
    public final Course_service course_service;

    public Course_cont(Course_service course_service){
        this.course_service = course_service;
    }

    @Operation(summary = "save courses", description = "insert cource values into table")
    @PostMapping("/save-course")
    public Course_Resp_dto saveCourse(
        @Valid @RequestBody Course_dto course_dto
    ) {
        return this.course_service.saveCourse(course_dto);
    }

    @Operation(summary = "get courses", description = "return a list of courses")
    @GetMapping("/get-courses")
    public List<Course> getCourses(){
        return course_service.getCourse();
    }

    @Operation(summary = "delete a course", description = "delete a course by their respective id")
     @DeleteMapping("/author/delete/{course-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("course-id") Integer id){
        course_service.delete(id);
    }

}
