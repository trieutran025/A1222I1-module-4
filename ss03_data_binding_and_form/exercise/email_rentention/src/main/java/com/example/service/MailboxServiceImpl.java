package com.example.service;

import com.example.model.Mailbox;
import com.example.repository.MailboxRepoI;
import com.example.repository.MailboxRepoImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MailboxServiceImpl implements MailboxServiceI{
    MailboxRepoI repoI = new MailboxRepoImpl();
    @Override
    public List<Mailbox> findAll() {
        return repoI.findAll();
    }

    @Override
    public void create(Mailbox mailbox) {
    }

    @Override
    public void update(Mailbox mailbox) {
        repoI.update(mailbox);
    }

    @Override
    public Mailbox findById(String id) {
        return repoI.findById(id);
    }
}
