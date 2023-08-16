package com.music.repo;

import com.music.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class MusicRepoImpl implements MusicRepoI{
    private static List <Music> musicList= new ArrayList<>();
    @Override
    public void create(Music music) {
        musicList.add(music);
    }

    @Override
    public List<Music> findAll() {
        return musicList;
    }
}
