package com.sda.tudor.bookmanagement.service;

import com.sda.tudor.bookmanagement.service.exception.EntityNotFoundException;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

public interface BookReviewService {
    void createBookReview(String bookTitle, int score, String comment) throws InvalidParameterException, EntityNotFoundException;
}
