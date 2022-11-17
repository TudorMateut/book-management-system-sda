package com.sda.tudor.bookmanagement.repository;

import com.sda.tudor.bookmanagement.model.Author;

public class AuthorRepositoryImpl extends BaseRepositoryImpl<Author> implements AuthorRepository{
    public AuthorRepositoryImpl() {
        super(Author.class);
    }
}
