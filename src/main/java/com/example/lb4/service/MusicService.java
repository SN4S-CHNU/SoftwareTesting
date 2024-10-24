package com.example.lb4.service;

/*
    @author sn4s
    @project lb4
    @class com.example.lb4.service
    @version 1
    @SE 24.10.24
*/

import com.example.lb4.model.Music;
import com.example.lb4.repository.MusicRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicService {
    private final MusicRepo musicRepo;
    private static List<Music> musiclist = new ArrayList<Music>();

    {
        musiclist.add(new Music("1","Маршрутка", "Скрябін", "Many"));
        musiclist.add(new Music("2","FE!N","Travis Scott", "UTOPIA"));
        musiclist.add(new Music("3", "goosebumps", "Travis Scott", "Rodeo"));
    }


    @PostConstruct
    void init() {
        musicRepo.saveAll(musiclist);
    }

    public List<Music> getMusicList() {
        return musicRepo.findAll();
    }
    public Music getById(String id) {
        return musicRepo.findById(id).orElse(null);
    }
    public Music add(Music music) {
        return musicRepo.save(music);
    }
    public Music update(Music music) {
        return musicRepo.save(music);
    }
    public void delete(String id) {
        musicRepo.deleteById(id);
    }
}
