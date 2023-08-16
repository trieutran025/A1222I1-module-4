package com.music.controller;

import com.music.entity.Music;
import com.music.entity.MusicForm;
import com.music.service.MusicServiceI;
import com.music.service.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Value("${file-upload}")
    private String fileUpload;
    MusicServiceI serviceI = new MusicServiceImpl();
    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("musicList",serviceI.findAll());
        return "/music/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("songForm",new Music());
        model.addAttribute("musicGenres",getMusicGenres());
        return "/music/create";
    }
    public List<String> getMusicGenres(){
        List<String> musicGenres = new ArrayList<>();
        musicGenres.add("rap");
        musicGenres.add("lofi");
        musicGenres.add("trữ tình");
        return musicGenres;
    }


    @PostMapping("/create")
    public String saveProduct(@ModelAttribute MusicForm musicForm ) {
        MultipartFile multipartFile = musicForm.getLink();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(musicForm.getLink().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Music music = new Music(musicForm.getId(), musicForm.getNameSong(),
                musicForm.getAuthor(), musicForm.getMusicGenres(),fileName);
        serviceI.create(music);
        return "redirect:/music/list";
    }
}
