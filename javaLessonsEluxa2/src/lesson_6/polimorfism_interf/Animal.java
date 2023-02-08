package lesson_6.polimorfism_interf;

public class Animal implements AbleToSleep {


    public void eat() {
        System.out.println("Animal is eating ");
    }


    @Override
    public void sleep() {
        System.out.println("Animal is sleeping ");
    }
}
