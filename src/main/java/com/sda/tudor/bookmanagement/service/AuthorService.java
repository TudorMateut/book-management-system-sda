package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

public interface AuthorService {
    void createAuthor(String firstName, String lastName) throws InvalidParameterException;
}
