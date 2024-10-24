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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/music")
@RequiredArgsConstructor
public class MusicController {
    private final MusicService musicService;

    @RequestMapping("/hello")
    public String hello() {
        return "<h1> !!!!!!! hello !!!!!!! <h1>";
    }

    @RequestMapping("/")
    public List<Music> showAll() {
        return musicService.getMusicList();
    }
}
