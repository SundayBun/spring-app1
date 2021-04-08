package some_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 *  это классе применим Ioq (inversion of control)
 */

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //    @Autowired
//    public MusicPlayer(Music clmusic, RockMusic rcmusic) {
//        this.music = clmusic;
//        this.music = rcmusic;
//    }

    // @Autowired
    //здесь внедряем зависимость DI
   // public MusicPlayer(Music music) {
    //    this.music = music;
   // }
   // @Autowired
    //DI через сеттер
    //public void setMusic(Music music) {
    //    this.music = music;
   // }


    public String playMusic(MusicStyle musicStyle){
        switch (musicStyle){
            case ROCK:return "Playing: "+  music1.getSong()[randomChoice()];
            case CLASSICAL: return "Playing: "+  music2.getSong()[randomChoice()];
        }
        return "";
      //  return "Playing: "+ music1.getSong()+", "+music2.getSong();
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
