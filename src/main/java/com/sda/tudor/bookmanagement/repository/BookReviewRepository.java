package com.sda.tudor.bookmanagement.repository;

import com.sda.tudor.bookmanagement.model.Book;
import com.sda.tudor.bookmanagement.model.BookReview;

import java.util.Optional;

public interface BookReviewRepository extends BaseRepository<BookReview> {
    Optional<Book> findByTitle(String title);
}
