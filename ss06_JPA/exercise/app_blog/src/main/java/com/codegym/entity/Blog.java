package com.codegym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "blog_table")
@Entity
public class Blog {
    @Id
    @GeneratedValue
    private int id;
    private String header;
    private String content;

    public Blog(int id, String header, String content) {
        this.id = id;
        this.header = header;
        this.content = content;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
