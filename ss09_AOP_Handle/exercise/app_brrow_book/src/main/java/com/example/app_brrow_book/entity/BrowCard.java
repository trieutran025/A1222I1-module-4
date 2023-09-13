package com.example.app_brrow_book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class BrowCard {
    @Id
    @GeneratedValue
    @Column(name = "brookCard_id")
    private int id;
    private String browCardCode;
    @Column(columnDefinition = "Date")
    private String startBrow;

    public BrowCard(int id, String browCardCode, String startBrow) {
        this.id = id;
        this.browCardCode = browCardCode;
        this.startBrow = startBrow;
    }

    public BrowCard(String browCardCode) {
        this.browCardCode = browCardCode;
    }

    public BrowCard(String browCardCode, String startBrow) {
        this.browCardCode = browCardCode;
        this.startBrow = startBrow;
    }

    public BrowCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrowCardCode() {
        return browCardCode;
    }

    public void setBrowCardCode(String browCardCode) {
        this.browCardCode = browCardCode;
    }

    public String getStartBrow() {
        return startBrow;
    }

    public void setStartBrow(String startBrow) {
        this.startBrow = startBrow;
    }

}
