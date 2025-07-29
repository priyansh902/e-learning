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

import com.priyansh.spring.Dto.Lecture_dto;
import com.priyansh.spring.RespDto.Lecture_Resp_dto;
import com.priyansh.spring.Service.Lecture_service;
import com.priyansh.spring.model.Lecture;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Lecture_cont {
    
    public final Lecture_service lecture_service;

    public Lecture_cont(Lecture_service lecture_service){
        this.lecture_service = lecture_service;
    }

    @Operation(summary = "save lectures", description = "insert lectures into databases")
     @PostMapping("/save-lecture")
    public Lecture_Resp_dto savelecture(
        @Valid @RequestBody Lecture_dto lecture_dto
    ) {
        return this.lecture_service.savelecture(lecture_dto);
    }

    @Operation(summary = "Get lectures", description = "returns a list of lectures")
    @GetMapping("/get-lecture")
    public List<Lecture> getlectures(){
        return lecture_service.getlecture();
    }


    @Operation(summary = "delete  a leccture", description = "delete by their resp.id")
     @DeleteMapping("/author/delete/{lecture-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("lecture-id") Integer id){
        lecture_service.delete(id);
    }

}
