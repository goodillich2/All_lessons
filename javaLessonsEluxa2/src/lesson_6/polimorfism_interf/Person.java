package lesson_6.polimorfism_interf;

public class Person implements AbleToSleep{
    @Override
    public void sleep() {
        System.out.println("Person is sleeping");
    }

    public void work() {
        System.out.println("Person is working");
    }
}
