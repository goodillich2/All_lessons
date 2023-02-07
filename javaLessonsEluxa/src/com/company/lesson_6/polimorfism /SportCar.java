package com.company.lesson_6.polimorfism;

public class SportCar extends com.company.lesson_6.polimorfism.Car
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
