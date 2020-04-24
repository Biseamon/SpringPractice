package com.mypractice.springcourse;

public class MusicPlayer {

    private Music music; //The interface

    //Inversion of Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing the song: " + music.getSong());
    }
}
