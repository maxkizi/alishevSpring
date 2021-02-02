package ru.alishev.springcourseAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        id = 1;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
