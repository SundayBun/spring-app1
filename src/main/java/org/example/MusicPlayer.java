package org.example;

import java.util.List;

/**
 *  это классе применим Ioq (inversion of control)
 */
public class MusicPlayer {
    private List<Music> musicList;
    private Music music;
    private String name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //DI через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }

    //здесь внедряем зависимость DI
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //при DI через сеттер Spring берет конструтор по-умолчанию
    //при назначении конструктора, конструктор по-умолчанию удалется, поэтому создадим конструтор по умолч
    public MusicPlayer() {
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

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }

    public void doMyInit(){
        System.out.println("Checking calling for init method");
    }
    public void doMyDestroy(){
        System.out.println("Checking calling for destroy method");
    }

}
