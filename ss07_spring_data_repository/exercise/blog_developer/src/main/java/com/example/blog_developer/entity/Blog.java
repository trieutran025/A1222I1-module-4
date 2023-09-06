package com.example.blog_developer.entity;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private int id;
    private String author;
    private String header;
    private String content;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public Blog(int id, String author, String header, String content, Category category) {
        this.id = id;
        this.author = author;
        this.header = header;
        this.content = content;
        this.category = category;
    }

    public String getAuthor() {
        return author;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
