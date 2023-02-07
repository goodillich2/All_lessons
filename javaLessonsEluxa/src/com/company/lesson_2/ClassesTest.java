package com.company.lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class ClassesTest {

    public static void main(String[] args) {
//    Class_name refName      создаем обьект  () - конструткор
        Person person1      =   new Person();
        person1.name = "Илья";
        person1.age = 19;
        person1.speak();
//        int birth =  person1.calculateBirthDay();
//        System.out.println("birthday of person1 = " + birth);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current year: ");
        System.out.println("birthday of " + person1.name + " = " + person1.calculateBirthDay(scanner.nextInt()));
//        System.out.println("birthday of " + person1.name + " = " + person1.calculateBirthDay(2022);

//        System.out.println("My name " + person1.name + " my age " + person1.age);

        Person person2  =  new Person();
        person2.name = "Роман";
        person2.age = 25;
        person2.speak();
        int[] array2222 = new int[10];
        System.out.println("birthday of " + person2.name + " = " + person2.calculateBirthDay(2022));
//        System.out.println("My name " + person2.name + " my age " + person2.age);

//        int[] newAr = new int[]{2,5,3,6};
        person2.printMassive(new int[]{2,5,3,6});


    }
}


// публичный класс только один и = названею файла
// пишется с большой буквы


class Person{
    String name;
    int age;

    void speak(){
        System.out.println("my name is " + name + " my age = " + age);
    }

    int calculateBirthDay(int currentYear){
        int birthday = currentYear - age;
        return birthday;
    }


    void printMassive(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}


