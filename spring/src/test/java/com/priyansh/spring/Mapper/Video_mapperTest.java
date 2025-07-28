package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Video_dto;
import com.priyansh.spring.RespDto.Video_Resp_dto;
import com.priyansh.spring.model.Video;

public class Video_mapperTest {

    private Video_mapper video_mapper;

    @BeforeEach
    void setup(){
        video_mapper = new Video_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testVideo_Resp_dto() {
        //Given
        Video_dto video_dto = new Video_dto(5);

        //when
        Video video = video_mapper.videoo(video_dto);

        //then
        Assertions.assertEquals(video_dto.length(), video.getLength());

    }

    @Test
    void testVideoo() {
        //Given
        Video video = new Video(5);

        //when
        Video_Resp_dto video_Resp_dto = video_mapper.video_Resp_dto(video);

        //then
        Assertions.assertEquals(video.getLength(), video_Resp_dto.length());

    }
}
