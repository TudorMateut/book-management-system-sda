package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.model.Author;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

import java.util.List;

public interface AuthorService {
    void createAuthor(String firstName, String lastName) throws InvalidParameterException;

    List<Author> getAllAuthors();
}
