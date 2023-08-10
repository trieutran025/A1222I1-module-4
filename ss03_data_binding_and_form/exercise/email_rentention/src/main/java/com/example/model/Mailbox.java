package com.example.model;

import java.util.List;

public class Mailbox {
    private String id ;
    private String language;
    private  String pageSize;
    private  String filter;
    private String signature;

    public Mailbox() {
    }

    public Mailbox(String id, String languages, String pageSize, String filter, String signature) {
        this.id = id;
        this.language = languages;
        this.pageSize = pageSize;
        this.filter = filter;
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public Mailbox(String id, String pageSize, String filter, String signature) {
        this.id = id;
        this.pageSize = pageSize;
        this.filter = filter;
        this.signature = signature;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String displayLanguage() {
        if (language == null) {
            return "";
        } else return null;
    }
}
