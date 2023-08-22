package com.codegym.service;

import com.codegym.entity.Image;
import com.codegym.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    ImageRepo imageRepo ;
    @Override
    public List<Image> findAll() {
        return imageRepo.findAll();
    }

    @Override
    public void add(Image image) {
        imageRepo.add(image);
    }

    @Override
    public Image findById(int id) {
        return imageRepo.findById(id);
    }

    @Override
    public void updateLike(int id) {
        imageRepo.updateLike(id);
    }

    @Override
    public void update(Image image) {
        imageRepo.update(image);
    }

    @Override
    public boolean checkDate(int id) {
        imageRepo.checkDate(id);
        return false;
    }
}
