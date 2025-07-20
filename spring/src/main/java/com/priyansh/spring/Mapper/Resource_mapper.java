package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Resource_dto;
import com.priyansh.spring.model.Resource;

@Service
public class Resource_mapper {
    public Resource resourcee(Resource_dto resource_dto){
        var resource = new Resource();

        resource.setName(resource.getName());
        resource.setSize(resource.getSize());
        resource.setUrl(resource.getUrl());

        return resource;
    }

    public Resource_dto resource_dto(Resource resource){
        return new Resource_dto(resource.getName(), resource.getSize(), resource.getUrl());
    }
}
