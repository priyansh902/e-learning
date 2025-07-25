package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Lecture_dto;
import com.priyansh.spring.Mapper.Lecture_mapper;
import com.priyansh.spring.Repository.Lectire_Repo;
import com.priyansh.spring.RespDto.Lecture_Resp_dto;
import com.priyansh.spring.model.Lecture;

@Service
public class Lecture_service {
    
    public final Lectire_Repo lectire_Repo;

    public final Lecture_mapper lecture_mapper;

    public Lecture_service(Lectire_Repo lectire_Repo,Lecture_mapper lecture_mapper){
        this.lectire_Repo = lectire_Repo;
        this.lecture_mapper = lecture_mapper;
    }

     public Lecture_Resp_dto savelecture(Lecture_dto lecture_dto){
        var lecture = lecture_mapper.leecture(lecture_dto);
        var saved = lectire_Repo.save(lecture);
        return lecture_mapper.lecture_resp_dto(saved);
    }

    public List<Lecture> getlecture(){
        return lectire_Repo.findAll();
    }

    public void delete(Integer id){
          lectire_Repo.deleteById(id);
    }

    public Lecture tocourse(Lecture lecture){
       return lectire_Repo.save(lecture);
    }

}
