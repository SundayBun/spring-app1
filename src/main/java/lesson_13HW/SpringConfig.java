package lesson_13HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//проставляем аннотации, чтобы класс соответствовал xml файлу
@Configuration
@ComponentScan("lesson_13HW")
@PropertySource("classpath:musicPlayer12lesson.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }
    @Bean
    public List<Music> musicList(){
    return Arrays.asList(rockMusic(),classicalMusic(),jazzMusic());
}

}
