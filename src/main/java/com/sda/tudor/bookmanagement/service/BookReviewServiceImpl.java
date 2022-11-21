package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.model.Book;
import com.sda.tudor.bookmanagement.model.BookReview;
import com.sda.tudor.bookmanagement.repository.BookRepository;
import com.sda.tudor.bookmanagement.repository.BookReviewRepository;
import com.sda.tudor.bookmanagement.service.exception.EntityNotFoundException;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

import java.util.Optional;

public class BookReviewServiceImpl implements BookReviewService {
    private final BookRepository bookRepository;
    private final BookReviewRepository bookReviewRepository;

    public BookReviewServiceImpl(BookRepository bookRepository, BookReviewRepository bookReviewRepository) {
        this.bookRepository = bookRepository;
        this.bookReviewRepository = bookReviewRepository;
    }

    @Override
    public void createBookReview(String bookTitle, int score, String comment) throws InvalidParameterException, EntityNotFoundException {
        if (bookTitle == null || bookTitle.isBlank() || bookTitle.length() < 3) {
            throw new InvalidParameterException("Provided value for book title: " + bookTitle + " is invalid");
        }
        if (comment == null || comment.isBlank() || comment.length() < 10) {
            throw new InvalidParameterException("Provided value for comment: " + comment + " is invalid");
        }
        if (score < 1 || score > 5) {
            throw new InvalidParameterException("Provided value for score: " + score + " is invalid");
        }
        Optional<Book> bookOptional = bookReviewRepository.findByTitle(bookTitle);
        if (bookOptional.isEmpty()) {
            throw new EntityNotFoundException("Book not found for title: " + bookTitle);
        }
        Book book = bookOptional.get();

        BookReview bookReview = new BookReview(score, comment);
        bookReview.setBook(book);
        bookReviewRepository.create(bookReview);
    }
}
