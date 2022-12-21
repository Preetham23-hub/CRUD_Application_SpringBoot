package com.crud.crudApplication.models;

//import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
//@Table(name = 'tblBook')

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	private String bookName;
	private String bookAuthor;
	
	
	public String getBookName() {
		return bookName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

}
