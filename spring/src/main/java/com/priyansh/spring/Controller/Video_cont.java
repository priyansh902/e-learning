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

import com.priyansh.spring.Dto.Video_dto;
import com.priyansh.spring.RespDto.Video_Resp_dto;
import com.priyansh.spring.Service.Video_service;
import com.priyansh.spring.model.Video;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Video_cont {
    
    private final Video_service video_service;

    public Video_cont(Video_service video_service){
        this.video_service = video_service;
    }

    @Operation(summary = "save video", description = "inserting video into database")
     @PostMapping("/save-video")
    public Video_Resp_dto savevideo(
         @Valid @RequestBody Video_dto video_dto
      ) {
        return this.video_service.saveVideo(video_dto);
     }

     @Operation(summary = "get videos", description = "returns a list of videos")
     @GetMapping("/get-video")
     public List<Video> getVideos(){
        return video_service.getVideo();
    }

    @Operation(summary= "delete video", description = "delete by id")
     @DeleteMapping("/author/delete/{video-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("video-id") Integer id){
        video_service.delete(id);
    }

}
