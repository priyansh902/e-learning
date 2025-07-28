package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Section_dto;
import com.priyansh.spring.RespDto.Section_Resp_dto;
import com.priyansh.spring.model.Section;

public class Section_mapperTest {

    private Section_mapper section_mapper;

    @BeforeEach
    void setup(){
        section_mapper = new Section_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testSection_resp_dto() {
        //Given
        Section_dto section_dto = new Section_dto("video", "one");

        //then
        Section section = section_mapper.sectionn(section_dto);

        //when
        Assertions.assertEquals(section_dto.name(), section.getName());
        Assertions.assertEquals(section_dto.Sectionorder(), section.getSectionorder());

    }

    @Test
    void testSectionn() {
        //Given
        Section section = new Section(null, "one", "two", null, null);

        //when
        Section_Resp_dto section_Resp_dto = section_mapper.section_resp_dto(section);

        //then
        Assertions.assertEquals(section.getName(), section_Resp_dto.name());
        Assertions.assertEquals(section.getSectionorder(), section_Resp_dto.Sectionorder());
        

    }
}
