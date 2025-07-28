package com.priyansh.spring.Mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.priyansh.spring.Dto.Author_dto;
import com.priyansh.spring.RespDto.Author_Resp_dto;
import com.priyansh.spring.model.Author;

public class Author_mapperTest {

    private Author_mapper author_mapper;

    @BeforeEach
    void setup(){
        author_mapper = new Author_mapper();
        System.out.println("run succesfully");
    }

    @Test
    void testAuthor_Resp_dto() {

        //Given
        Author_dto author_dto = new Author_dto("priyan", "shu", "ps@gmail.com", 19);

        //When
        Author author = author_mapper.tAuthor(author_dto);



        //Then
        Assertions.assertEquals(author_dto.firstname(), author.getFirstname());
        Assertions.assertEquals(author_dto.lastname(), author.getLastname());
        Assertions.assertEquals(author_dto.email(), author.getEmail());
        Assertions.assertEquals(author_dto.age(), author.getAge());

    }

    @Test
    void testTAuthor() {
        //given
        // Author_Resp_dto author_Resp_dto = new Author_Resp_dto
        Author author = new Author("priyan", "sh", "ps@gmail.com", 20, null);

        //when
        Author_Resp_dto author_Resp_dto = author_mapper.author_Resp_dto(author);


        //Then
        Assertions.assertEquals(author.getFirstname(), author_Resp_dto.firstname());
        Assertions.assertEquals(author.getLastname(), author_Resp_dto.lastname());
        Assertions.assertEquals(author.getEmail(), author_Resp_dto.email());
        Assertions.assertEquals(author.getAge(), author_Resp_dto.age());
    }
}
