package com.priyansh.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.priyansh.spring.Dto.Author_dto;
import com.priyansh.spring.Mapper.Author_mapper;
import com.priyansh.spring.Repository.Author_repo;
import com.priyansh.spring.RespDto.Author_Resp_dto;
import com.priyansh.spring.model.Author;

@Service
public class Author_service {
    
    private final Author_repo author_repo;

    private final Author_mapper author_mapper;

    public Author_service(Author_repo author_repo,Author_mapper author_mapper){
        this.author_repo = author_repo;
        this.author_mapper = author_mapper;
    }

    public Author_Resp_dto saveAuthor(Author_dto author_dto){
        var author = author_mapper.tAuthor(author_dto);
        var saved = author_repo.save(author);
        return author_mapper.author_Resp_dto(saved);
    }

    public List<Author> getAuthor(){
        return author_repo.findAll();
    }

    public void delete(Integer id){
        author_repo.deleteById(id);
    }

    public Author toauthor(Author author){
        return author_repo.save(author);
    }

}
