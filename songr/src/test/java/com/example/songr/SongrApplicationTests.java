package com.example.songr;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void AlbumTest()
	{
		List<Album> allAlbums = new ArrayList<>();
		Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
		allAlbums.add(myAlbum);
		assertTrue(myAlbum.getArtist()== "Sami Yusuf");
	}
	@Test
	void AlbumTest2()
	{
		List<Album> allAlbums = new ArrayList<>();
		Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
		allAlbums.add(myAlbum);
		assertTrue(myAlbum.getTitle() =="Al-Mu'allim");
	}
	@Test
	void AlbumTest3()
	{
		List<Album> allAlbums = new ArrayList<>();
		Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
		allAlbums.add(myAlbum);
		assertTrue(myAlbum.getLength() ==5);
	}
	@Test
	void AlbumTest4()
	{
		List<Album> allAlbums = new ArrayList<>();
		Album myAlbum=  new Album("Al-Mu'allim","Sami Yusuf",8,5,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvHHro_2CB3jf1Irc4wUoyPqjjTkWAUfICQ&usqp=CAU");
		allAlbums.add(myAlbum);
		assertTrue(myAlbum.getSongCount() ==8
		);
	}

}
