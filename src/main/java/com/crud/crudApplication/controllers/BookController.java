package com.crud.crudApplication.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.crudApplication.models.Book;
import com.crud.crudApplication.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;

@PostMapping("/bookSave")	
public String insertBook(@RequestBody Book  book)
{
	bookRepository.save(book);
	return "Book has been saved successfully!!";	
}

@PostMapping("/multipleBookSave")	
public String insertBook(@RequestBody List<Book>  book)
{
	bookRepository.saveAll(book);
	return "Books has been saved successfully!!";
}


@GetMapping("/getAllBooks")	
public List<Book> getBook()
{
 return (List<Book>) bookRepository.findAll();	
}

@GetMapping("/getByBookName/{name}")	
public List<Book> getBook(@PathVariable("name") String BookName)
{
 return (List<Book>) bookRepository.findBybookName(BookName);
}

@GetMapping("/getByBookId/{bookid}")	
public Optional<Book> getBook(@PathVariable("bookid")Long id)
{
 return  bookRepository.findById(id);
}


@GetMapping("/deleteByBookId/{bookid}")	
public String deleteBook(@PathVariable("bookid")Long id)
{
 bookRepository.deleteById(id);
 return "Book has been deleted successfully!!";
}
}
