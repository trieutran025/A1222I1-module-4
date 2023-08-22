package com.codegym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue
    private int id;
    private int rate;
    private String author;
    private String feedback;
    private int Likes;
    private String startDate;

    public Image(int id, int rate, String author, String feedback, int likes, String startDate) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.feedback = feedback;
        this.Likes = likes;
        this.startDate = startDate;
    }


    public Image() {
    }

    public String getStartDate() {
        return startDate;
    }



    public int getLikes() {
        return Likes;
    }

    public void setLikes(int like) {
        this.Likes = like;
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
