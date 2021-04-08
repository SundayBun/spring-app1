package some_package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

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
        return "Playing: "+ music1.getSong()+", "+music2.getSong();
    }

    public void doMyInit(){
        System.out.println("Checking calling for init method");
    }
    public void doMyDestroy(){
        System.out.println("Checking calling for destroy method");
    }

}
