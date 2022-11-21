package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.model.Book;
import com.sda.tudor.bookmanagement.service.exception.EntityNotFoundException;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

import java.util.List;

public interface BookService {
    void createBook(String title, String description, int authorId) throws InvalidParameterException, EntityNotFoundException;

    List<Book> getAllBooks();
}
