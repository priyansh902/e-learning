package com.priyansh.spring.Dto;

import jakarta.persistence.Column;

public record Author_dto(

     String firstname,

     String lastname,

        @Column(unique = true)
     String email,

     int age
) {
    
}
