package lesson_13HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *  это классе применим Ioq (inversion of control)
 */

@Component
public class MusicPlayer {

    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public String playMusic(){
       return "Playing"+ Arrays.toString(musicList.get(randomChoice()).getSong());
    }

    public int randomChoice(){

        return new Random().nextInt(3);
      // return (int) (1+Math.random()*3);
//        Random random = new Random();
//
//        // случайное целое число между 0 и 2
//        int randomNumber = random.nextInt(3);
    }

    public void doMyInit(){
        System.out.println("Checking calling for init method");
    }
    public void doMyDestroy(){
        System.out.println("Checking calling for destroy method");
    }

}
