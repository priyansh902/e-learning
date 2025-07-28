package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.File_dto;
import com.priyansh.spring.RespDto.File_Resp_dto;

public class File_mapperTest {
    private File_mapper file_mapper;

    @BeforeEach
    void setup(){
        file_mapper = new File_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testFiile() {
        //Given 
        File_dto file_dto = new File_dto("Audio");

        //when
        com.priyansh.spring.model.File file = file_mapper.fiile(file_dto);

        //then
        Assertions.assertEquals(file_dto.type(), file.getType());

    }

    @Test
    void testFile_dto() {
        //Given
        com.priyansh.spring.model.File file = new com.priyansh.spring.model.File("audio");

        //when
        File_Resp_dto file_Resp_dto = file_mapper.file_dto(file);

        //then
        Assertions.assertEquals(file.getType(), file_Resp_dto.type());

    }
}
