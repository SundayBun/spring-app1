package org.example;

public class ClassicalMusic implements Music{
    //ограничим создание объекта класса вызовом private конструктора,
    // объект класса будем получать из фабричного метода
    private ClassicalMusic(){}

    //фабричный метод, дб статическим(т.е должен вызываться на классе, а не на объекте)
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "BohemianRhapsody";
    }
     public void doMyInit(){
         System.out.println("Doing my initialisation");
     }

     public void doMyDestroy(){
         System.out.println("Doing my destruction");
     }
}
