package com.example.lb4.repository;

import com.example.lb4.model.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
    @author sn4s
    @project lb4
    @class com.example.lb4.repository
    @version 1
    @SE 24.10.24
*/

@Repository
public interface MusicRepo extends MongoRepository<Music, String> {
}
