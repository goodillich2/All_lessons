package com.company.lesson_3;

import java.util.Random;

public class ObjectAndClassesTest {
    public static void main(String[] args)
    {

        //------------------------------------------------
        // ссылочные типы данных
        // класс и обьект
        // класс - это шаблон (описание будущих обьектов)
        // обьект - что-то конкретное с четкими параметрами

        Human illia = new Human();
        illia.age = 19;
        illia.gender = "male";
        illia.name = "illia";


        System.out.println("\nAge of Illia = " +  illia.age);
        System.out.println("gender of Illia = " +  illia.gender);

        Human oleg = new Human();
        oleg.gender = "male";
        oleg.age = 25;
        oleg.name = "oleg";
        System.out.println("\nAge of oleg = " +  oleg.age);
        System.out.println("gender of oleg = " +  oleg.gender);



        Animal dog = new Animal();
        dog.age = 5;
        dog.name = "Sharik";

        // функция/метод
        Human sasha = new Human();
        sasha.name = "sasha";
        sasha.age = 20;
        sasha.gender = "male";
        sasha.sayHello();
        sasha.printInfo();

        Human valya = new Human();
        valya.name = "valya";
        valya.age = 25;
        valya.gender = "female";
        valya.sayHello();
        valya.printInfo();
//        int year = valya.getYearOfBirth();
//        System.out.println("year of valya birthday = " + year);
        System.out.println("year of valya birthday = " + valya.getYearOfBirth(2023));

        // lesson-4
        System.out.println("\n\n\n");
        Human danil = new Human();
        danil.age = 19;
        danil.name = "danil";
        danil.gender = "male";
        int year =  danil.getYearOfBirth(2023);
        System.out.println("year of danil birthday = " + year);



    }
}

class Human {
    int age; // поле класса
    String name;// поле класса
    String gender;// поле класса

    void sayHello(){
        System.out.println("Hello!!!");
    }


    void printInfo(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My gender is " + gender);
    }

    int getYearOfBirth(int currentYear)
    {
        int yearOfBirth = currentYear - age;
        return yearOfBirth;
    }


}

class Animal{
    int age;
    String color;
    //String color = "black";
    String name;
    char gender;
}

