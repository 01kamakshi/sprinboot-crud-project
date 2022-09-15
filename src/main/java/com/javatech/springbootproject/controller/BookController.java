package com.javatech.springbootproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.springbootproject.model.Book;
import com.javatech.springbootproject.repo.BookRepository;

@RestController                    
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	//Adding single book
	@PostMapping("/bookSave")             
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);                                   
		return "Record saved successfuly!";
	}
	
	//Adding multiple or list of book
	@PostMapping("/multipleBookSave")						    
	public String insertBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);                              
		return "Record saved successfuly!";
		 
	}
	
	// Fetching all book 
	@GetMapping("/getAllBook")
	public List<Book> getBook() {
		return bookRepository.findAll();
	}
	
	//get book by name
	@GetMapping("/getByBookName/{name}")
	public List<Book> getBook(@PathVariable("name") String bookName) {
		return bookRepository.findBybookName(bookName);
	}
	
	//get book by its id
	@GetMapping("/getByBookId/{bookId}")
	public Optional<Book> getBook(@PathVariable("bookId") Long id) {
		return bookRepository.findById(id);
	}
	
	//Deleting book by book id
	@DeleteMapping("/books/{bookId}")
	public String deleteBook(@PathVariable("bookId") Long bookId) {
		  bookRepository.deleteById(bookId);
		  return "book deleted";
		
	}
	
	//
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return null;
	}
//	
}


