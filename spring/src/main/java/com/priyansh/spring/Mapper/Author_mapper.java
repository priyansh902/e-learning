package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Author_dto;
import com.priyansh.spring.RespDto.Author_Resp_dto;
import com.priyansh.spring.model.Author;

@Service
public class Author_mapper {
    
    public Author tAuthor(Author_dto author_dto){
        var author = new Author();
        author.setFirstname(author_dto.firstname());
        author.setLastname(author_dto.lastname());
        author.setEmail(author_dto.email());
         author.setAge(author_dto.age());


        return author;
    }

    public Author_Resp_dto author_Resp_dto(Author author){
        return new Author_Resp_dto(author.getFirstname(), author.getLastname(), author.getEmail(), author.getAge());
    }

}
