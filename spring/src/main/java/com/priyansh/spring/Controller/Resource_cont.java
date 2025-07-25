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

import com.priyansh.spring.Dto.Resource_dto;
import com.priyansh.spring.RespDto.Resource_Resp_dto;
import com.priyansh.spring.Service.Resource_service;
import com.priyansh.spring.model.Resource;

import jakarta.validation.Valid;

@RestController
public class Resource_cont {
    
    public final Resource_service resource_service;

    public Resource_cont(Resource_service resource_service){
       this.resource_service = resource_service;
    }

      @PostMapping("/save-resource")
    public Resource_Resp_dto saveresource(
        @Valid @RequestBody Resource_dto resource_dto
    ) {
        return this.resource_service.saveresource(resource_dto);
    }

    @GetMapping("/get-resource")
    public List<Resource> getrResources(){
        return resource_service.getresource();
    }

     @DeleteMapping("/author/delete/{resource-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("resource-id") Integer id){
        resource_service.delete(id);
    }


}
