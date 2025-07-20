package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Text_dto;
import com.priyansh.spring.model.Text;

@Service
public class Text_mapper {
    
    public Text textt(Text_dto text_dto){
        var text = new Text();
        text.setContent(text.getContent());
        return text;
    }

    public Text_dto text_dto(Text text){
        return new Text_dto(text.getContent());
    }
}
