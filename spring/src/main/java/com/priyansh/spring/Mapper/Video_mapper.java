package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Video_dto;
import com.priyansh.spring.model.Video;

@Service
public class Video_mapper {
    public Video videoo(Video_dto video_dto){
        var video = new Video();
        video.setLength(video.getLength());

        return video;
    }

    public Video_dto video_dto(Video video){
        return new Video_dto(video.getLength());
    }
}
