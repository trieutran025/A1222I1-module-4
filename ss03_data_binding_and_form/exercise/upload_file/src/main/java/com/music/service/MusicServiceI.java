package com.music.service;

import com.music.entity.Music;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MusicServiceI {
    void create(Music music);
    List<Music> findAll();
}
