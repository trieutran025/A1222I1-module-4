package com.music.service;

import com.music.entity.Music;
import com.music.repo.MusicRepoI;
import com.music.repo.MusicRepoImpl;

import java.util.List;

public class MusicServiceImpl implements MusicServiceI {
    MusicRepoI repoI = new MusicRepoImpl();

    @Override
    public void create(Music music) {
        repoI.create(music);
    }

    @Override
    public List<Music> findAll() {
        return repoI.findAll();
    }
}
