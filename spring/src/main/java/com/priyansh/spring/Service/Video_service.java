package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Video_dto;
import com.priyansh.spring.Mapper.Video_mapper;
import com.priyansh.spring.Repository.Video_Repo;
import com.priyansh.spring.RespDto.Video_Resp_dto;
import com.priyansh.spring.model.Video;

@Service
public class Video_service {
    
    private final Video_mapper video_mapper;

    private final Video_Repo video_Repo;

    public Video_service(Video_mapper video_mapper,Video_Repo video_Repo){
        this.video_Repo = video_Repo;
        this.video_mapper = video_mapper;
    }

    
     public Video_Resp_dto saveVideo(Video_dto video_dto){
        var video = video_mapper.videoo(video_dto);
        var saved = video_Repo.save(video);
        return video_mapper.video_Resp_dto(saved);
    }

     public List<Video> getVideo(){
        return video_Repo.findAll();
    }

    public void delete(Integer id){
          video_Repo.deleteById(id);
    }

}
