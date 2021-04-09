package lesson_13HW;

import org.springframework.stereotype.Component;


//@Scope("singleton")
public class ClassicalMusic implements Music {


    public void doMyInit(){
        System.out.println("Doing my init-method");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy-method");
    }

    @Override
    public String[] getSong() {
        return new String[]{"BohemianRhapsody","Moon sonata","The times of the year"};
    }
}
