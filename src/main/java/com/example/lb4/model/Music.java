package com.example.lb4.model;

/*
    @author sn4s
    @project lb4
    @class com.example.lb4.model
    @version 1
    @SE 24.10.24
*/

import io.micrometer.observation.annotation.Observed;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document

public class Music {
    private String id;
    private String name;
    private String artist;
    private String album;

    public Music( String name, String artist, String album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(id, music.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
