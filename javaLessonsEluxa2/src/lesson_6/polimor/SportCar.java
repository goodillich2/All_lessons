package lesson_6.polimor;

public class SportCar extends Car
{

    public void competeWithOtherCar()
    {
        System.out.println("SportCar is competing");
    }

    @Override
    public void drive() {
        System.out.println("SportCar is driving");
    }
}
