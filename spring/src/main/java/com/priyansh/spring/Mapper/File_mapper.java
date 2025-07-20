package com.priyansh.spring.Mapper;

import com.priyansh.spring.model.File;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.File_dto;

@Service
public class File_mapper {
    
    public File fiile(File_dto file_dto){
        var file = new File();
        file.setType(file.getType());

        return file;
    }

    public File_dto file_dto(File file){
        return new File_dto(file.getType());
    }
}
