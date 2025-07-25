package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Text_dto;
import com.priyansh.spring.RespDto.Text_Resp_dto;
import com.priyansh.spring.model.Text;

@Service
public class Text_mapper {
    
    public Text textt(Text_dto text_dto){
        var text = new Text();
        text.setContent(text_dto.content());
        return text;
    }

    public Text_Resp_dto text_resp_dto(Text text){
        return new Text_Resp_dto(text.getContent());
    }
}
