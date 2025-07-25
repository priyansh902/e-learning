package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Text_dto;
import com.priyansh.spring.Mapper.Text_mapper;
import com.priyansh.spring.Repository.Text_repo;
import com.priyansh.spring.RespDto.Text_Resp_dto;
import com.priyansh.spring.model.Text;

@Service
public class Text_service {
    
    private final Text_mapper text_mapper;
    private final Text_repo text_repo;

    public Text_service(Text_mapper text_mapper,Text_repo text_repo){
        this.text_mapper = text_mapper;
        this.text_repo = text_repo;
    }


     public Text_Resp_dto saveText(Text_dto text_dto){
        var text = text_mapper.textt(text_dto);
        var saved = text_repo.save(text);
        return text_mapper.text_resp_dto(saved);
    }

     public List<Text> getText(){
        return text_repo.findAll();
    }

    public void delete(Integer id){
          text_repo.deleteById(id);
    }

}
