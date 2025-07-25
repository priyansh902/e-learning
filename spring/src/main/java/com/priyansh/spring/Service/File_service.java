package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.File_dto;
import com.priyansh.spring.Mapper.File_mapper;
import com.priyansh.spring.Repository.File_Repo;
import com.priyansh.spring.RespDto.File_Resp_dto;
import com.priyansh.spring.model.File;

@Service
public class File_service {
    private final File_Repo file_Repo;
    private final File_mapper file_mapper;

    public File_service( File_Repo file_Repo,File_mapper file_mapper){
        this.file_Repo = file_Repo;
        this.file_mapper = file_mapper;
    }
    public File_Resp_dto savefile(File_dto File_dto){
        var File = file_mapper.fiile(File_dto);
        var saved = file_Repo.save(File);
        return file_mapper.file_dto(saved);
    }

    public List<File> getFile(){
        return file_Repo.findAll();
    }

    public void delete(Integer id){
          file_Repo.deleteById(id);
    }

    public File tocourse(File file){
       return file_Repo.save(file);
    }

}
