package com.example.bookstore.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.bookstore.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
