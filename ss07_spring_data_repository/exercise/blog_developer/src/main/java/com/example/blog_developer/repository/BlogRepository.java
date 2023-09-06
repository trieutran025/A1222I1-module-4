package com.example.blog_developer.repository;

import com.example.blog_developer.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
    @Query(name = "select * from Blog where header like :header", nativeQuery = true)
    List<Blog> findByHeader(@Param("header") String header);
}
