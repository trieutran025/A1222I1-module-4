package com.example.app_brrow_book.repository;

import com.example.app_brrow_book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface BookRepository extends JpaRepository<Book,Integer> {
    @Modifying
    @Transactional
    @Query(value = QueryDB.BORROWED_BOOK_MINUS_ONE,nativeQuery = true)
    void minusOneBookBorrowedQuantity(@Param("idBook") int idBook);
    @Modifying
    @Transactional
    @Query(value = QueryDB.RETURN_BOOK_MINUS_ONE,nativeQuery = true)
    void minusOneBookReturnQuantity(@Param("idBook") int idBook);
}
