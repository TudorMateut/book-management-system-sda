package com.sda.tudor.bookmanagement.controller;

import com.sda.tudor.bookmanagement.service.BookReviewService;
import com.sda.tudor.bookmanagement.service.exception.EntityNotFoundException;
import com.sda.tudor.bookmanagement.service.exception.InvalidParameterException;

import java.util.Scanner;

public class BookReviewController {
    private final Scanner scanner = new Scanner(System.in);
    private final BookReviewService bookReviewService;

    public BookReviewController(BookReviewService bookReviewService) {
        this.bookReviewService = bookReviewService;
    }

    public void createBookReview() {
        try {
            System.out.println("Please insert book title");
            String title = scanner.nextLine();
            System.out.println("Please insert a score");
            int score = Integer.parseInt(scanner.nextLine());
            System.out.println("Please insert a comment");
            String comment = scanner.nextLine();

            bookReviewService.createBookReview(title, score, comment);
            System.out.println("Book review was created!");
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please insert numeric value for score!");
        } catch (Exception e) {
            System.out.println("Internal system error!");
        }
    }
}
