package com.priyansh.spring.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table
public class Author extends BaseEntity {
    
   
    // @GeneratedValue(strategy = GenerationType.TABLE,
    // generator = "autor_id_gen")
    // @TableGenerator(name = "autor_id_gen",
    // table = "id_generation",
    // pkColumnName = "id_name",
    // valueColumnName = "id_value",
    // allocationSize = 1).

   
    private String firstname;

    private String lastname;

    @Column(unique = true)
    private String email;

    private int age;


    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
