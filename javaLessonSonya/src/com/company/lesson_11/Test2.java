package com.company.lesson_11;

public class Test2
{
    public static void main(String[] args)
    {

        Animal1 a = new Animal1();
        a.age = 17;
        a.color = "black";
        a.sleep();
        a.eat();
        String str =  a.toString(); // строковая инфа про обьект = твоему printInfo()
        System.out.println(str);

        System.out.println("\n");


        Dog1 d = new Dog1();
        d.age = 7;
        d.name = "Sharik";
        d.color = "black";
        d.breed = "Buldog";

        d.sleep();
        d.eat();
        d.bark();

        ///  inckap
        Animal1 animal1 = new Dog1();
        animal1.eat();
        animal1.sleep();


    }
}


class Animal1
{
    String color;
    int age;

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }
    public void eat()
    {

        System.out.println("Animal is eating");
    }

    @Override
    public String toString()
    {

        return "colour of animal = " + color + " \nage of animal = " + age;
    }


}


// Object(toString, equals) - Animal1(toString, equals, eat, sleep) - Dog(toString, equals, eat, sleep, bark)


class Dog1 extends Animal1
{
    String breed;
    String name;

    public void bark()
    {
        System.out.println(name +  " is barking");
    }

    // переопрделение методов ( изменение реализации метода родителского класса в классе наследнике)

    @Override // for view
    public void eat()
    {
        System.out.println(name + " is eating");
    }
}

//



