package com.music.entity;

import org.springframework.web.multipart.MultipartFile;

public class MusicForm {
    private int id;
    private String nameSong;
    private String author;
    private String musicGenres;
    private MultipartFile link;

    public MusicForm(int id, String nameSong, String author, String musicGenres, MultipartFile link) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.musicGenres = musicGenres;
        this.link = link;
    }

    public String getMusicGenres() {
        return musicGenres;
    }

    public void setMusicGenres(String musicGenres) {
        this.musicGenres = musicGenres;
    }

    public MusicForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public MultipartFile getLink() {
        return link;
    }

    public void setLink(MultipartFile link) {
        this.link = link;
    }
}
