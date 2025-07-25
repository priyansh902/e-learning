package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Resource_dto;
import com.priyansh.spring.Mapper.Resource_mapper;
import com.priyansh.spring.Repository.Resource_repo;
import com.priyansh.spring.RespDto.Resource_Resp_dto;
import com.priyansh.spring.model.Resource;

@Service
public class Resource_service {
    
    public final Resource_mapper resource_mapper;

    public final Resource_repo resource_repo;

    public Resource_service(Resource_mapper resource_mapper, Resource_repo resource_repo){
        this.resource_mapper = resource_mapper;
        this.resource_repo = resource_repo;
    }

    public Resource_Resp_dto saveresource(Resource_dto resource_dto){
        var resource = resource_mapper.resourcee(resource_dto);
        var saved = resource_repo.save(resource);
        return resource_mapper.resource_resp_dto(saved);
    }

     public List<Resource> getresource(){
        return resource_repo.findAll();
    }

    public void delete(Integer id){
          resource_repo.deleteById(id);
    }

    public Resource toresource(Resource resource){
       return resource_repo.save(resource);
    }

}
