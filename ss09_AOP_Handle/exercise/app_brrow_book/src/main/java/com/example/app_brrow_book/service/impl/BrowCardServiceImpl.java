package com.example.app_brrow_book.service.impl;

import com.example.app_brrow_book.entity.BrowCard;
import com.example.app_brrow_book.repository.BrowCardRepository;
import com.example.app_brrow_book.service.BrowCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowCardServiceImpl implements BrowCardService {
    @Autowired
    BrowCardRepository browCardRepository;

    @Override
    public void create(BrowCard browCard) {
        browCardRepository.save(browCard);
    }
}
