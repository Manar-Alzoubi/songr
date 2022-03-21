package com.example.songr.web;

import com.example.songr.domain.Album;

import com.example.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HelloWorldController {

    @Autowired
    AlbumRepository albumRepository;

    // this method for test adding to database
    @GetMapping("/addToDB") // just for testing
    public void addAlbumToDB(){
        System.out.println("add test");
        Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf ",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
        albumRepository.save(myAlbum);
        Album newAlbum = new Album("lolo","sadan",1234, 23,"hi");
        albumRepository.save(newAlbum);
        // check if it is added by write a SELECT Query in CLI
        // select * from album;

    }

    @PostMapping("/addAlbum")
    public RedirectView addNewAlbum(@ModelAttribute Album album ){
            System.out.println("************ add album *************************");
            albumRepository.save(album);
            return new RedirectView("allalbums");

    }

    @GetMapping("/allalbums")
    public String getAlbums(Model model){
        System.out.println("**********all albums ***********");
        model.addAttribute("albumsList",albumRepository.findAll());
        System.out.println(albumRepository.findAll());
        return "album";
    }



    @GetMapping("/hello")
    String greeting()
    {
        System.out.println("you'r now on Hello page");
        return "helloPage";
    }

    @GetMapping("/capitalize/{textToCapitalize}")
    String capitalize(@PathVariable String textToCapitalize , Model Model){
        Model.addAttribute("textToCapitalize",textToCapitalize.toUpperCase(Locale.ROOT));
                return "Capitalize";

    }
    @ResponseBody
    @GetMapping("/albums")
    List<Album> renderAllAlbums(){
        List <Album> allAlbums = new ArrayList<>();
        Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf ",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
        allAlbums.add(myAlbum);
        Album myAlbum1=  new Album("Forgive Me","Maher Zain",14,10,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbf-Ut7gJxzIvmQCtIIxnIYQ7Q9x0Si0UnSg&usqp=CAU");
        allAlbums.add(myAlbum1);
        Album myAlbum2=  new Album("Not Afraid To Stand Alone","Native Deen",21,36,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61J4G%2B%2BYf1L._SY355_.jpg&imgrefurl=https%3A%2F%2Fwww.amazon.com%2FAfraid-Stand-Alone-Native-Deen%2Fdp%2FB000ZKNAF2&tbnid=dkw7Z2Ch4F3M1M&vet=12ahUKEwiC0J64gs72AhWBtSoKHVncA78QMygAegUIARCfAQ..i&docid=BYKMiCZ4hmcoFM&w=355&h=355&q=native%20deen%20Not%20Afraid%20To%20Stand%20Alone&ved=2ahUKEwiC0J64gs72AhWBtSoKHVncA78QMygAegUIARCfAQ");
        allAlbums.add(myAlbum2);
        return allAlbums;
    }

}
