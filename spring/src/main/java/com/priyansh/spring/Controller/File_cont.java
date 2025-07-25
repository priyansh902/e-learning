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

import com.priyansh.spring.Dto.File_dto;
import com.priyansh.spring.RespDto.File_Resp_dto;
import com.priyansh.spring.Service.File_service;
import com.priyansh.spring.model.File;

import jakarta.validation.Valid;

@RestController
public class File_cont {
    
public final File_service file_service;

public File_cont( File_service file_service){
    this.file_service = file_service;
}

 @PostMapping("/save-File")
    public File_Resp_dto saveFile(
        @Valid @RequestBody File_dto file_dto
    ) {
        return this.file_service.savefile(file_dto);
    }

    @GetMapping("/get-file")
    public List<File> getfiles(){
        return file_service.getFile();
    }

     @DeleteMapping("/author/delete/{file-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("file-id") Integer id){
        file_service.delete(id);
    }


}
