package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Section_dto;
import com.priyansh.spring.model.Section;

@Service
public class Section_mapper {
    public Section sectionn(Section_dto section_dto){
        var section = new Section();
        section.setName(section.getName());
        section.setSectionorder(section.getSectionorder());

        return section;
    }

    public Section_dto section_dto(Section section){
        return new Section_dto(section.getName(), section.getSectionorder());
    }
}
