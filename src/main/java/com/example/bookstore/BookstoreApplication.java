package com.example.bookstore;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

// Custom imports
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
    ApplicationRunner init(BookRepository repository) {
        return args -> {
            Stream.of(new Book(null, "Horton Hears a Who", "Dr. Seuss"), new Book(null, "A Brief History of Time", "Stephen Hawking"),
                    new Book(null, "Brave New World", "Aldous Huxley")).forEach(book -> {
                repository.save(book);
            });
        };
    }

}
