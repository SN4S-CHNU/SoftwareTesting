package com.example.lb4.repository;

import com.example.lb4.model.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
    @author sn4s
    @project lb4
    @class com.example.lb4.repository
    @version 1
    @SE 24.10.24
*/

@Repository
public interface MusicRepository extends MongoRepository<Music, String> {
    @Query("{ 'id': ?0 }")
    Optional<Music> findByCode(String code);
}
