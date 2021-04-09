package lesson_13HW;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {

    @Override
    public String[] getSong() {
        return new String[] {"Wind cries Merry","New divide", "We will rock you"};
    }
}
