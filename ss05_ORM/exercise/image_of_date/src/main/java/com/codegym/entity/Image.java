package com.codegym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue
    private int id;
    private int rate;
    private String author;
    private String feedback;
    private int likes;
    private String startDate;

    public Image(int id, int rate, String author, String feedback, int likes, String startDate) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.feedback = feedback;
        this.likes = likes;
        this.startDate = startDate;
    }


    public Image() {
    }

    public String getStartDate() {
        return startDate;
    }



    public int getLikes() {
        return likes;
    }

    public void setLikes(int like) {
        this.likes = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
