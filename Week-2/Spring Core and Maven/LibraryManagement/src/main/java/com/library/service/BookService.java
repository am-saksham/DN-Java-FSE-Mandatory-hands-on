package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection: Spring will use this to inject the repository bean
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageLibrary() {
        System.out.println("Service: Managing library operations...");
        // Calling the injected repository
        bookRepository.saveBook();
    }
}