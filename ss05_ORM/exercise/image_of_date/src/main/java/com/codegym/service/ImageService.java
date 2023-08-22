package com.codegym.service;

import com.codegym.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();
    void add(Image image);
    Image findById(int id);
    void updateLike(int id);
    void update(Image image);
    boolean checkDate(int id);
}
