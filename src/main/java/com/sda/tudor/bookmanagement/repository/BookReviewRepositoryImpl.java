package com.sda.tudor.bookmanagement.repository;

import com.sda.tudor.bookmanagement.model.Book;
import com.sda.tudor.bookmanagement.model.BookReview;
import com.sda.tudor.bookmanagement.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookReviewRepositoryImpl extends BaseRepositoryImpl<BookReview> implements BookReviewRepository {
    public BookReviewRepositoryImpl() {
        super(BookReview.class);
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            Query<Book> query = session.createQuery("FROM Book b WHERE b.title = :bookTitle", Book.class);
            query.setParameter("bookTitle", title);
            List<Book> books = new ArrayList<>();
            if (!books.isEmpty()) {
                return Optional.of(books.get(0));
            } else {
                return Optional.empty();
            }
        }
    }
}
