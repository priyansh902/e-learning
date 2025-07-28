package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Text_dto;
import com.priyansh.spring.RespDto.Text_Resp_dto;
import com.priyansh.spring.model.Text;

public class Text_mapperTest {

    private Text_mapper text_mapper;

    @BeforeEach
    void setup(){
        text_mapper = new Text_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testText_resp_dto() {
        //Given
        Text_dto text_dto = new Text_dto("study");

        //when
        Text text = text_mapper.textt(text_dto);

        //then
        Assertions.assertEquals(text_dto.content(), text.getContent());

    }

    @Test
    void testTextt() {
        //Given
        Text text = new Text("text");

        //when
        Text_Resp_dto text_Resp_dto = text_mapper.text_resp_dto(text);

        //then
        Assertions.assertEquals(text.getContent(), text_Resp_dto.content());

    }
}
