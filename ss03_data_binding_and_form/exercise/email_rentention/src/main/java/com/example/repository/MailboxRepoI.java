package com.example.repository;

import com.example.model.Mailbox;

import java.util.List;

public interface MailboxRepoI {
    List<Mailbox> findAll();
    void create(Mailbox mailbox);
    void update (Mailbox mailbox);
    Mailbox findById(String id);
}
