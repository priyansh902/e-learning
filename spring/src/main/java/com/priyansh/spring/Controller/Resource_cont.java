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

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Resource_cont {
    
    public final Resource_service resource_service;

    public Resource_cont(Resource_service resource_service){
       this.resource_service = resource_service;
    }

    @Operation(summary = "save resourses", description = "insert resources into database")
      @PostMapping("/save-resource")
    public Resource_Resp_dto saveresource(
        @Valid @RequestBody Resource_dto resource_dto
    ) {
        return this.resource_service.saveresource(resource_dto);
    }

    @Operation(summary = "get resources", description = "returns a list of resources")
    @GetMapping("/get-resource")
    public List<Resource> getrResources(){
        return resource_service.getresource();
    }

    @Operation(summary = "delete a resource", description = "delete a resource by id")
     @DeleteMapping("/author/delete/{resource-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("resource-id") Integer id){
        resource_service.delete(id);
    }


}
