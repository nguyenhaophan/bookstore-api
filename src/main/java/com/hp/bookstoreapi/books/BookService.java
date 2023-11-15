package com.hp.bookstoreapi.books;

import com.hp.bookstoreapi.books.dtos.CreateBookDTO;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final Logger logger = LoggerFactory.getLogger(BookService.class);
    private final ModelMapper modelMapper;

    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public Book getBookByTitle(String title) {
        Book book = bookRepository.findBookByTitle(title);

        if (book == null) {
            logger.info("Book with title {} can't be found", title);
        }

        return book;
    }

    public void createBook(CreateBookDTO request) {
        Book newBook = convertToEntity(request);
        bookRepository.save(newBook);
    }

    private Book convertToEntity(CreateBookDTO request) {
        return modelMapper.map(request, Book.class);
    }
}
