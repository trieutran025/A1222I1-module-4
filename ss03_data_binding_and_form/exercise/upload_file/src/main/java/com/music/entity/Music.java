package com.music.entity;
public class Music {
    private int id;
    private String nameSong;
    private String author;
    private String musicGenres;
    private String link;

    public Music(int id, String nameSong, String author, String musicGenres, String link) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.musicGenres = musicGenres;
        this.link = link;
    }

    public Music() {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMusicGenres() {
        return musicGenres;
    }

    public void setMusicGenres(String musicGenres) {
        this.musicGenres = musicGenres;
    }
}
