package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Resource_dto;
import com.priyansh.spring.RespDto.Resource_Resp_dto;
import com.priyansh.spring.model.Resource;

public class Resource_mapperTest {

    private Resource_mapper resource_mapper;

    @BeforeEach
    void setup(){
        resource_mapper = new Resource_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testResource_resp_dto() {
        //Given
        Resource_dto resource_dto = new Resource_dto("video", 5, "http.v3.com");

        //when
        Resource resource = resource_mapper.resourcee(resource_dto);

        //then
        Assertions.assertEquals(resource_dto.name(), resource.getName());
        Assertions.assertEquals(resource_dto.size(), resource.getSize());
        Assertions.assertEquals(resource_dto.url(), resource.getUrl());

    }

    @Test
    void testResourcee() {
        //Given
        Resource resource = new Resource(1, "video", 5, "http.gv.com", null);

        //when
        Resource_Resp_dto resource_Resp_dto = resource_mapper.resource_resp_dto(resource);

        //then
        Assertions.assertEquals(resource.getName(), resource_Resp_dto.name());
        Assertions.assertEquals(resource.getSize(), resource_Resp_dto.size());
        Assertions.assertEquals(resource.getUrl(), resource_Resp_dto.url());

    }
}
