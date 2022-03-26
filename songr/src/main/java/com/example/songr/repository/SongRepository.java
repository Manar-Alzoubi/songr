package com.example.songr.repository;

import com.example.songr.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends JpaRepository<Song,Integer> {
}
