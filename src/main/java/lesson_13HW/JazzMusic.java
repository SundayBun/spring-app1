package lesson_13HW;

import org.springframework.stereotype.Component;

public class JazzMusic  implements Music {

    @Override
    public String[] getSong() {
        return new String[]{"Jazz music 1","Jazz music 2","Jazz music 3"};
    }
}
