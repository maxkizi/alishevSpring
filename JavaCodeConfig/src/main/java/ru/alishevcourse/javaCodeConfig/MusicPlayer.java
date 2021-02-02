package ru.alishevcourse.javaCodeConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> musicList;
    @Value("${musicPlayerName}")
    private String name;
    @Value("${musicPlayerVolume}")
    private int volume;


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        int i = random.nextInt(3);
        return musicList.get(i).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
