package com.priyansh.spring.Mapper;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Author_dto;
import com.priyansh.spring.model.Author;

@Service
public class Author_mapper {
    
    public Author tAuthor(Author_dto author_dto){
        var author = new Author();
        author.setFirstname(author.getFirstname());
        author.setLastname(author.getLastname());
        author.setAge(author.getAge());
        author.setEmail(author.getEmail());

        return author;
    }

    public Author_dto author_dto(Author author){
        return new Author_dto(author.getFirstname(), author.getLastname(), author.getEmail(), author.getAge());
    }

}
