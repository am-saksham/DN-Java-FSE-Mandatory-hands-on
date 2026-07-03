package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryApplication {
    public static void main(String[] args) {
        // 1. Load the Spring application context from the XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve the fully configured BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // 3. Test the setup
        System.out.println("--- Spring Context Loaded ---");
        bookService.manageLibrary();
    }
}