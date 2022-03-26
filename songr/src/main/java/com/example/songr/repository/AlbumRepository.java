package com.example.songr.repository;

import com.example.songr.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends JpaRepository<Album,Integer> {
}
