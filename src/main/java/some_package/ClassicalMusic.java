package some_package;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String[] getSong() {
        return new String[]{"BohemianRhapsody","Moon sonata","The times of the year"};
    }
}
