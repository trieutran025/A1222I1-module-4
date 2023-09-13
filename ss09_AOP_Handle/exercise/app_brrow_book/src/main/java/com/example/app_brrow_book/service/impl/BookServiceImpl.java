package com.example.app_brrow_book.service.impl;

import com.example.app_brrow_book.entity.Book;
import com.example.app_brrow_book.repository.BookRepository;
import com.example.app_brrow_book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void minusOneBookQuantity(int idBook) {
        bookRepository.minusOneBookBorrowedQuantity(idBook);
    }

    @Override
    public void returnOneBookQuantity(int idBook) {
        bookRepository.minusOneBookReturnQuantity(idBook);
    }


}
