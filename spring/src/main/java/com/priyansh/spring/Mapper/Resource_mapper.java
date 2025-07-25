package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Resource_dto;
import com.priyansh.spring.RespDto.Resource_Resp_dto;
import com.priyansh.spring.model.Resource;

@Service
public class Resource_mapper {
    public Resource resourcee(Resource_dto resource_dto){
        var resource = new Resource();

        resource.setName(resource_dto.name());
        resource.setSize(resource_dto.size());
        resource.setUrl(resource_dto.url());

        return resource;
    }

    public Resource_Resp_dto resource_resp_dto(Resource resource){
        return new Resource_Resp_dto(resource.getName(), resource.getSize(), resource.getUrl());
    }
}
