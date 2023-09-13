package com.example.app_brrow_book.entity;

import javax.persistence.*;

@Entity
public class BookBrowCard {
    @Id
    @GeneratedValue
    @Column(name = "book_brow_card_id")
    private int id;
    @ManyToOne()
    @JoinColumn(name = "book_id",nullable = false,referencedColumnName = "book_id")
    private Book book;
    @ManyToOne()
    @JoinColumn(name = "brookCard_id",nullable = false,referencedColumnName = "brookCard_id")
    private BrowCard browCard;

    public BookBrowCard(int id, Book book, BrowCard browCard) {
        this.id = id;
        this.book = book;
        this.browCard = browCard;
    }

    public BookBrowCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BrowCard getBrowCard() {
        return browCard;
    }

    public void setBrowCard(BrowCard browCard) {
        this.browCard = browCard;
    }
}
