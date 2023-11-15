package com.hp.bookstoreapi.books;

import com.hp.bookstoreapi.books.dtos.CreateBookDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;
    private final BookService bookService;

    public BookController(BookRepository bookRepository, BookService bookService) {
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{title}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook(@Valid @RequestBody CreateBookDTO request) {
        bookService.createBook(request);
    }
}
