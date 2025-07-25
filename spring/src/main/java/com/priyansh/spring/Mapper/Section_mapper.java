package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Section_dto;
import com.priyansh.spring.RespDto.Section_Resp_dto;
import com.priyansh.spring.model.Section;

@Service
public class Section_mapper {
    public Section sectionn(Section_dto section_dto){
        var section = new Section();
        section.setName(section_dto.name());
        section.setSectionorder(section_dto.Sectionorder());

        return section;
    }

    public Section_Resp_dto section_resp_dto(Section section){
        return new Section_Resp_dto(section.getName(), section.getSectionorder());
    }
}
