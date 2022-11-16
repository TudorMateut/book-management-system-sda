package com.sda.tudor.bookmanagement.utils;

import com.sda.tudor.bookmanagement.model.Author;
import com.sda.tudor.bookmanagement.model.Book;
import com.sda.tudor.bookmanagement.model.BookReview;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {
    private static final SessionManager INSTANCE = new SessionManager();
    // static si final alcatuiesc o constanta

    private SessionManager() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("book_management_system");
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        // Hibernate model will be added here
        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(BookReview.class);
    }
}
