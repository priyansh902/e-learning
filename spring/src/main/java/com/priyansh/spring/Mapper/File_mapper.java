package com.priyansh.spring.Mapper;

import com.priyansh.spring.model.File;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.File_dto;
import com.priyansh.spring.RespDto.File_Resp_dto;

@Service
public class File_mapper {
    
    public File fiile(File_dto file_dto){
        var file = new File();
        file.setType(file_dto.type());

        return file;
    }

    public File_Resp_dto file_dto(File file){
        return new File_Resp_dto(file.getType());
    }
}
