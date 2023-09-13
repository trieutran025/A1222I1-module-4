package com.example.app_brrow_book.service;

import com.example.app_brrow_book.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> findAll();
    void create(Book book);
    void update(Book book);
    Book findById(int id);
    void minusOneBookQuantity( int idBook);
    void returnOneBookQuantity( int idBook);
}
