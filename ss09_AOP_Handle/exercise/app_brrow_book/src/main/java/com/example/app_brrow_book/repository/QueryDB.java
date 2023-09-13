package com.example.app_brrow_book.repository;

import org.springframework.data.jpa.repository.Query;

public class QueryDB {
    public static final String BORROWED_BOOK_MINUS_ONE = "UPDATE  book  SET book.quantity = book.quantity - 1  WHERE (book.book_id = ?1)";
    public static final String RETURN_BOOK_MINUS_ONE = "UPDATE  book  SET book.quantity = book.quantity + 1  WHERE (book.book_id = ?1)";
}
