package com.mypractice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext");

//        ClassicMusic classicMusic = context.getBean("musicBean",ClassicMusic.class);
//        System.out.println(classicMusic.getSong());

        Music music = context.getBean("musicBean", Music.class);
        Music music1 = context.getBean("musicBean1", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer.playMusic1();
        musicPlayer1.playMusic1();




        //scope singleton
//        MusicPlayer music = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer music1 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = music == music1;
//
//        System.out.println(comparison);
//        System.out.println(music);
//        System.out.println(music1);
//
//        music.setVolume(25);
//        System.out.println(music.getVolume());
//        System.out.println(music1.getVolume());
//        //end singleton scope
//
//        ///First test of beans
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        System.out.println(testBean.getNum());
//        //End of testing the bean
//
//        //First attempts to use beans
//        music.playMusic();
//
//        System.out.println(music.getName());
//        System.out.println(music.getVolume());
//
//        System.out.println(music.getOrigin());
//        System.out.println(music.getCopiesSold());
        //end of attempts

        context.close();

    }

}
