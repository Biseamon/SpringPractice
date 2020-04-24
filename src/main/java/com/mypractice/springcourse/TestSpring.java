package com.mypractice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        MusicPlayer music = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(testBean.getName());
        System.out.println(testBean.getNum());

        music.playMusic();

        context.close();

    }

}
