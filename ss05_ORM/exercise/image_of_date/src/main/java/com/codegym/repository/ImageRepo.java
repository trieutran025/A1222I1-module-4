package com.codegym.repository;

import com.codegym.entity.Image;

import java.util.List;

public interface ImageRepo {
    List<Image> findAll();
    void add(Image image);

    Image findById(int id);

    void updateLike(int id);

    void update(Image image);

    void checkDate(int id);
}
