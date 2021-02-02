package ru.alishevcourse.javaCodeConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return musicPlayer.playMusic();
    }
}
