package com.example.service;

import com.example.model.Mailbox;

import java.util.List;

public interface MailboxServiceI {
    List<Mailbox> findAll();
    void create(Mailbox mailbox);
    void update (Mailbox mailbox);
    Mailbox findById(String id);
}
