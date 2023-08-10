package com.example.repository;

import com.example.model.Mailbox;

import java.util.*;

public class MailboxRepoImpl implements MailboxRepoI {
    private static Map<String, Mailbox> mailboxMap;





    static {
        mailboxMap = new HashMap<>();
        mailboxMap.put("1",new Mailbox("1","Vietnamese ","25"," ","Thor King"));
        mailboxMap.put("2",new Mailbox("2","English","5"," ","Thor King"));
        mailboxMap.put("3",new Mailbox("3","Japanese","15"," ","Bar King"));
        mailboxMap.put("4",new Mailbox("4","Chinese","50"," ","ken King"));
    }

    @Override
    public List<Mailbox> findAll() {
        return new ArrayList<>(mailboxMap.values());
    }

    @Override
    public void create(Mailbox mailbox) {
    }

    @Override
    public void update(Mailbox mailbox) {
        if (mailboxMap.containsKey(mailbox.getId())) {
            mailboxMap.put(mailbox.getId(), mailbox);
        }
    }

    @Override
    public Mailbox findById(String id) {
        return mailboxMap.get(id);
    }


}
