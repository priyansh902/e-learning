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

import com.priyansh.spring.Dto.Section_dto;
import com.priyansh.spring.RespDto.Section_Resp_dto;
import com.priyansh.spring.Service.Section_service;
import com.priyansh.spring.model.Section;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Section_cont {
    
    private final Section_service section_service;

    public Section_cont(Section_service section_service){
        this.section_service = section_service;
    }


    @Operation(summary = "save section", description = "insert section into database")
    @PostMapping("/save-section")
    public Section_Resp_dto saveSection(
      @Valid @RequestBody Section_dto section_dto
       ) {
        return this.section_service.saveSection(section_dto);
     }

     @Operation(summary = "get sections", description = "returns a list of sections")
     @GetMapping("/get-section")
     public List<Section> getsSections(){
        return section_service.getsection();
    }

    @Operation(summary = "delete a section", description = "delete section by their id")
     @DeleteMapping("/author/delete/{section-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("section-id") Integer id){
        section_service.delete(id);
    }

}
