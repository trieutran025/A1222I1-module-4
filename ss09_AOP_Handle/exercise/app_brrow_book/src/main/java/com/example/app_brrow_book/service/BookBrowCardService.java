package com.example.app_brrow_book.service;


import com.example.app_brrow_book.entity.BookBrowCard;
import org.springframework.stereotype.Service;

@Service
public interface BookBrowCardService {
    void createBookBrow(BookBrowCard bookBrowCard);
}
