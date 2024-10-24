package com.example.lb4.controller;

/*
    @author sn4s
    @project lb4
    @class com.example.lb4.controller
    @version 1
    @SE 24.10.24
*/

import com.example.lb4.model.Music;
import com.example.lb4.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/music/")
@RequiredArgsConstructor
public class MusicController {
    private final MusicService musicService;

    @GetMapping
    public List<Music> getMusic() {
        return musicService.getMusicList();
    }

    @GetMapping("{id}")
    public Music getMusicById(@PathVariable String id) {
        return musicService.getById(id);
    }

    @PostMapping
    public Music createMusic(@RequestBody Music music) {
        return musicService.add(music);
    }

    @PutMapping
    public Music updateMusic(@RequestBody Music music) {
        return musicService.update(music);
    }

    @DeleteMapping("{id}")
    public void deleteMusic(@PathVariable String id) {
        musicService.delete(id);
    }
}
