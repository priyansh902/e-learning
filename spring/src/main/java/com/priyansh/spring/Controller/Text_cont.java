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

import com.priyansh.spring.Dto.Text_dto;
import com.priyansh.spring.RespDto.Text_Resp_dto;
import com.priyansh.spring.Service.Text_service;
import com.priyansh.spring.model.Text;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
public class Text_cont {
    
    private final Text_service text_service;

    public Text_cont(Text_service text_service){
        this.text_service = text_service;
    }

    @Operation(summary = "save text", description = "inserting text into database")
    @PostMapping("/save-text")
    public Text_Resp_dto saveText(
         @Valid @RequestBody Text_dto text_dto
      ) {
        return this.text_service.saveText(text_dto);
     }

     @Operation(summary = "get texts",description = "returns a list of texts")
     @GetMapping("/get-text")
     public List<Text> gettTexts(){
        return text_service.getText();
    }

    @Operation(summary = "delete a text", description = "delete text by id")
     @DeleteMapping("/author/delete/{text-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("text-id") Integer id){
        text_service.delete(id);
    }

}
