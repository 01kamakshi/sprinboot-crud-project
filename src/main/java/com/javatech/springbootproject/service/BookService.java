package com.javatech.springbootproject.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatech.springbootproject.model.Book;
import com.javatech.springbootproject.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		Long bookId = book.getBookId();
		Book book1 = bookRepository.findById(bookId).get();
		book1.setBookAuthor(book1.getBookAuthor());
		book1.setBookId(book1.getBookId());
		book1.setBookName(book1.getBookName());
		return bookRepository.save(book1);
		
	}

}
