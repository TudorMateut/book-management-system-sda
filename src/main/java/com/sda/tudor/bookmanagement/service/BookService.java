package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.service.exception.EntityNotFoundException;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

public interface BookService {
    void createBook(String title, String description, int authorId) throws InvalidParameterException, EntityNotFoundException;
}