package com.music.repo;

import com.music.entity.Music;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MusicRepoI {
    void create(Music music);
    List<Music> findAll();
}
