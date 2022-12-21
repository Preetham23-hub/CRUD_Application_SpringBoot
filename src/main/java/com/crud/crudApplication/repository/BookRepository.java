package com.crud.crudApplication.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.crud.crudApplication.models.Book;


@Component
public interface BookRepository extends JpaRepository<Book,Long>{

	List<Book> findBybookName(String bookName);

}
