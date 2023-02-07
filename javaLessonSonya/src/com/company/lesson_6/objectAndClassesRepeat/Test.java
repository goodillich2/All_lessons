package com.company.lesson_6.objectAndClassesRepeat;

public class Test {
    public static void main(String[] args) {
        // создать класс машина описать его поля и создать несколько методов

        Car audi = new Car();
        audi.color = "black";
        audi.vendor = "audi";
        audi.maxSpeed = 250;
        audi.yearOfProduction = 2018;
        // вывести всю инфу об машине
         audi.printInfo();
        int a = audi.getAgeOfTheCar(2025);
        System.out.println("year of car " + audi.vendor + " = " + a);
//        int a2 = audi.getAgeOfTheCar(2025);
//        int a3 = audi.getAgeOfTheCar(2035);
//        int a4 = audi.getAgeOfTheCar(2049);

        // сделть метод,который будет считать возраст машины
    }
}


class Car {
    String color;
    int yearOfProduction;
    String vendor;
    int maxSpeed;

    void  printInfo()
    {
        System.out.println("information about car:");
        System.out.println("color of  car: " + color);
        System.out.println("color of  dateOfProduction: " + yearOfProduction);
        System.out.println("color of  maxSpeed: " + maxSpeed);
    }

    // 2023 - yearOfProduction // getAgeOfTheCar(y) = currentYear - const;

    int getAgeOfTheCar(int currentYear)
    {
        int result = currentYear - yearOfProduction;
        return result;
    }

}

