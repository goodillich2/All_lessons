package com.company.lesson_5.hmPractice;

public class Main
{
    public static void main(String[] args)
    {
        // примитивы
        int o = 8;
        long a = 9;
        char s = 'f';

        // классы(class) - то есть более сложные типы данных
        Human human = new Human();
        human.age = 20;
        human.name = "Oleg";
        human.sayHello();
        System.out.println();
        human.printInfo();
        int result =  human.test(5);
        System.out.println("result of function = " + result);

        Human human2 = new Human();
        human2.name = "Dima";
        human2.age = 9;



        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();
        Human human6 = new Human();

    }
}

// чертеж ( создания своего типа данных)
class Human
{
    int age;
    String name;

    // void - ничего не возращает
    void sayHello()
    {
        System.out.println("Hello world !!!");
    }

    void printInfo()
    {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    // y = 2x

    int test(int x)
    {
        return 2 * x;
    }


}

