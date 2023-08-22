package com.codegym.repository;

import com.codegym.entity.Image;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public class ImageRepoImpl implements  ImageRepo{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Image> findAll() {
        return entityManager.createQuery("from Image i").getResultList();
    }
    @Override
    public void add(Image image) {
        entityManager.persist(image);
    }

    @Override
    public Image findById(int id) {
        return entityManager.find(Image.class,id);
    }

    @Override
    public void updateLike(int id) {
        Image image = entityManager.find(Image.class,id);
        image.setLikes(image.getLikes()+1);
        entityManager.merge(image);
    }

    @Override
    public void update(Image image) {
        entityManager.merge(image);
    }

    @Override
    public void checkDate(int id) {
        Image image = entityManager.find(Image.class,id);
       String dateNow = LocalDate.now().toString();
       if(dateNow == image.getStartDate()){
           entityManager.merge(image);
       }
    }
}
