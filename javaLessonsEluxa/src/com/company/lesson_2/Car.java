package com.company.lesson_2;

public class Car {
    String name;
    int year;
    int hp;

    void printInfo(){
        System.out.println("Car model is " + name + "\nThe year of the car " + year + "\nCount of hp " + hp);
    }
    void carAge(int curYear){
        System.out.println("Age of the car " + (curYear - this.year));
    }


}


