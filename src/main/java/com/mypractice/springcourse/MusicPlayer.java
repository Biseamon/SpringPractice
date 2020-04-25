package com.mypractice.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList <>(); //The interface

    private Music music;

    private String name;
    private int volume;

    private String origin;
    private int copiesSold;

    public String getOrigin() {
        return origin;
    }

    public List <Music> getMusic() {
        return musicList;
    }

    public void setMusicList(List <Music> music) {
        this.musicList = music;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Inversion of Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){

        for(Music music : musicList)
            System.out.println("Playing the song: " + music.getSong());

    }

    public void playMusic1(){
        System.out.println("Playing the song: " + music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", origin='" + origin + '\'' +
                ", copiesSold=" + copiesSold +
                '}';
    }
}
