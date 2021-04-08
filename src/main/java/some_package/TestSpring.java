package some_package;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {


        //класс, который обращается к ApplicationContext(мой)
        // считывает его и помещает все bean которые там описаны в ApplicationContext
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Application9_lesson.xml");
        //передается мой файл Application(важно, чтобы мой ApplicationContext лежал в папке resources с пометкой)
  /*
       Music music=context.getBean("rockMusic",Music.class);

        System.out.println(music.getSong());
        Music music1=context.getBean("classicalMusic",Music.class);
        System.out.println(music1.getSong());

        MusicPlayer classicalMusicPlayer=new MusicPlayer(music1);
       classicalMusicPlayer.playMusic();

        //окончание работы со Spring
        context.close();

         */

        //урок 10
       // MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
      //  musicPlayer.playMusic();
        Computer computer=context.getBean("computer",Computer.class);
        System.out.println(computer);
    }
}
