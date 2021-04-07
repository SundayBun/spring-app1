package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringMusic {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext_Ioc.xml");
/*
        //объект зависимости задание в ручную
        Music music=context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer=new MusicPlayer(music);

 */
        //объект зависимости через dependency injection (DI)
        //MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);

        //объект зависимости через dependency injection (DI) через сеттер
        MusicPlayer musicPlayer=context.getBean("musicPlayerSetter",MusicPlayer.class);
        musicPlayer.playMusic();

        //получение значений name и volume
        System.out.println("Name: "+ musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());

        System.out.println("--------------HW----------------");
        for(Music music :musicPlayer.getMusicList()){
        System.out.println("Playing: "+music.getSong());
        }

        //рассматриваем scope singleton, сравниваем два объекта musicPlayer
        MusicPlayer musicPlayerOther=context.getBean("musicPlayerSetter",MusicPlayer.class);

        boolean comaparison=musicPlayer==musicPlayerOther; //== проверяет,указывают ли переменные на один участок памяти
        System.out.println("------------------------------");
        System.out.println(comaparison);
        System.out.println(musicPlayer);
        System.out.println(musicPlayerOther);

        context.close();
    }
}
