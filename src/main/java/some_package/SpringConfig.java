package some_package;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//проставляем аннотации, чтобы класс соответствовал xml файлу
@Configuration
@ComponentScan("some_package")
@PropertySource("classpath:musicPlayer12lesson.properties")
public class SpringConfig {
}
