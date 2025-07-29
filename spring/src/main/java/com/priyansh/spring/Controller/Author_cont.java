package com.priyansh.spring.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.spring.Dto.Author_dto;
import com.priyansh.spring.RespDto.Author_Resp_dto;
import com.priyansh.spring.Service.Author_service;
import com.priyansh.spring.model.Author;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@ResponseStatus(HttpStatus.CREATED)
@RequestMapping("/authors")
public class Author_cont {

    private final Author_service author_service;

    public Author_cont(Author_service author_service){
        this.author_service= author_service;
    }

    @Operation(summary = "inserting data into author table. ")
    @PostMapping("/save-Author")
    public Author_Resp_dto saveAuthor(
        @Valid  @RequestBody Author_dto author_dto
    ) {
        return this.author_service.saveAuthor(author_dto);
    }


    @Operation(summary = "Get all author", description = "Return a list of all authors.")
    @GetMapping("/get-author")
    public List<Author> getAuthor(){
        return author_service.getAuthor();
    }

    @PostMapping("/savee-author")
    public Author toauthor(@RequestBody Author author){
        return author_service.toauthor(author);
    }

    @Operation(summary = "Delete a author", description = "delete a author by their respective id")
    @DeleteMapping("/author/delete/{author-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable ("author-id") Integer id){
        author_service.delete(id);
    }
    
}
