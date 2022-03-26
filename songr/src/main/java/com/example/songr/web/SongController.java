package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    AlbumRepository albumRepository;


    @GetMapping("/songs")
    public String allSongs(Model model){
        model.addAttribute("allSongs",songRepository.findAll());
        return "Songs";
    }

    @PostMapping("/addSong")
    public RedirectView addNewSong(@ModelAttribute Song song){
        System.out.println(song);
        songRepository.save(song);
        return new RedirectView("songs");
    }

}
