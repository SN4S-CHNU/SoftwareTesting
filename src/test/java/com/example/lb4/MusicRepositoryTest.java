package com.example.lb4;

/*
    @author sn4s
    @project SoftwareTesting
    @class com.example.lb4.repository
    @version 
    @SE 27.10.24
*/

import com.example.lb4.model.Music;
import org.junit.jupiter.api.*;
import com.example.lb4.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DataMongoTest
class MusicRepositoryTest {

    @Autowired
    MusicRepository musicRepository;

    @BeforeEach
    void setUp() {
        Music scriabin =  new Music("1","Маршрутка", "Скрябін", "test");
        Music travis = new Music("2","FE!N","Travis Scott", "test");
        Music scott = new Music("3", "goosebumps", "Travis Scott", "test");

        musicRepository.saveAll(List.of(scriabin, scott, travis));
    }

    @AfterEach
    void tearDown() {
        List<Music> itemsToDelete = musicRepository.findAll().stream()
                .filter(item -> item.getArtist().contains("test"))
                .toList();
        musicRepository.deleteAll(itemsToDelete);
    }

    @Test
    void testSetShouldContains_3_Records_ToTest(){
        List<Music> itemsToDelete = musicRepository.findAll().stream()
                .filter(item ->item.getAlbum().contains("test"))
                .toList();
        assertTrue(itemsToDelete.size() >= 3, "Should contain at least 3 records with 'test' in the album field");
    }

    @Test
    void shouldGiveIdForNewMusic(){
        Music mus = new Music("listen!","hako","test");
        musicRepository.save(mus);

        Music found = musicRepository.findAll().stream()
                .filter(item -> item.getName().contains("listen!"))
                .findFirst().orElse(null);

        assertFalse(found.getId() == mus.getId());
        assertNotNull(found);
        assertNotNull(found.getId());
        assertFalse(found.getId().isEmpty());
        assertEquals(24,found.getId().length());
    }

    @Test
    void shouldUpgradeExistingMusicRecord() {
        Music original = new Music("4","Old Name", "Old Artist", "test");
        musicRepository.save(original);

        original.setName("New Name");
        original.setAlbum("new_album");
        musicRepository.save(original);

        Music updatedMusic = musicRepository.findById(original.getId()).orElse(null);
        assertNotNull(updatedMusic);
        assertEquals("New Name", updatedMusic.getName());
        assertEquals("new_album", updatedMusic.getAlbum());
    }

    @Test
    void shouldNotUpgradeNonExistentMusicRecord() {
        String nonExistentId = "999";
        Music nonExistentMusic = new Music(nonExistentId, "Ghost Song", "Unknown Artist", "test");

        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            Music music = musicRepository.findById(nonExistentId).orElseThrow();
            music.setName("Updated Ghost Song");
            musicRepository.save(music);
        });

        assertEquals("No value present", exception.getMessage());
        assertFalse(musicRepository.findById(nonExistentId).isPresent());
    }

    @Test
    void shouldReturnEmptyWhenCodeNotFoundInMongo() {
        Optional<Music> foundMusic = musicRepository.findByCode("nonexistent_id");

        assertFalse(foundMusic.isPresent(), "No music should be found for a nonexistent id");
    }

}