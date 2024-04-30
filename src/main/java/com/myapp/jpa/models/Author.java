package com.myapp.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//@Table(name = "AUTHOR_TBL")
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
