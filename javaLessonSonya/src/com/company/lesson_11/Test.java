package com.company.lesson_11;

public class Test {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Pet pets = new Pet();
        Dog dog = new Dog();
        ///////

        Animal animal1 = new Animal();
        animal1.age = 5;

        Pet p1 = new Pet();

        Dog dog1 = new Dog();





    }
}


// Animal - Pets - Cat
//                 Dog


// Human - Adult - Worker - (Programmer, Manager ... )

// Наследование
class Animal
{
    String color;
    int age;


}

class Pet extends Animal
{
    String name;


}


class Dog extends Pet
{
    String poroda;

}