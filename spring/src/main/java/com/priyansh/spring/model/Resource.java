package com.priyansh.spring.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@Entity

public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    // @Column(unique = true,
    // nullable = false)
    private String url;


    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
    
}
