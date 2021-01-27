package ru.alishev.springcourseXML;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for(Music m: musicList){
            System.out.println(m.getSong());
        }
    }
}
