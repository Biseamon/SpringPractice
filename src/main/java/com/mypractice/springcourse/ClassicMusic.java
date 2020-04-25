package com.mypractice.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class ClassicMusic implements Music {

    //Factory Method Pattern
    public ClassicMusic classicMusic;

    //Factory Method Pattern. Set it to private
    public ClassicMusic() {
    }



    //Factory Method Pattern
//    public static ClassicMusic getNewObj(){
//        return new ClassicMusic();
//    }

    //init the bean/object.Add the logic.
    public void doInit(){
        System.out.println("Initialising the app");
    }

    //if the bean has the scope set to prototype it will not work.
    //Works only with singleton.
    //Destroys the bean/object after termination.
    public void doDestroy(){
        System.out.println("Destroy the bean/app");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
