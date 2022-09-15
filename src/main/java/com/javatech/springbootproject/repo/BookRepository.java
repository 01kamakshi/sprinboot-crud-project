package com.javatech.springbootproject.repo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.javatech.springbootproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

public List<Book> findBybookName(String name);




	
}



 


