package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Section_dto;
import com.priyansh.spring.Mapper.Section_mapper;
import com.priyansh.spring.Repository.Section_repo;
import com.priyansh.spring.RespDto.Section_Resp_dto;
import com.priyansh.spring.model.Section;

@Service
public class Section_service {
    
private final Section_mapper section_mapper;

private final Section_repo section_repo;

    public Section_service(Section_mapper section_mapper,Section_repo section_repo){
         this.section_mapper = section_mapper;
         this.section_repo = section_repo;
    }

     public Section_Resp_dto saveSection(Section_dto section_dto){
        var section = section_mapper.sectionn(section_dto);
        var saved = section_repo.save(section);
        return section_mapper.section_resp_dto(saved);
    }

     public List<Section> getsection(){
        return section_repo.findAll();
    }

    public void delete(Integer id){
          section_repo.deleteById(id);
    }

    public Section tosection(Section section){
       return section_repo.save(section);
    }


}
