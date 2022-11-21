package com.sda.tudor.bookmanagement.repository;

import com.sda.tudor.bookmanagement.model.Book;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book> implements BookRepository{
    public BookRepositoryImpl() {
        super(Book.class);
    }
}
