package com.myapp.jpa.repositories;

import com.myapp.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
