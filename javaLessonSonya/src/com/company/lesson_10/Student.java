package com.company.lesson_10;

public class Student
{
    private String name;
    private int age;

    // constructors
    // правила создания конструктора: название = названию класса
    // у него нет возращаемого типа
    // нужны нам конструкторы для того, чтобы задать обьектам первончальные характеристики

     Student()
    {
        name = "default name";
        age = 25;
        System.out.println("Hello from 1 constructor");
    }

    Student(String name, int age)
    {
         this.age = age;
         this.name = name;
    }

    Student(int age)
    {
        this.age = age;
    }



    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo()
    {
        System.out.println("name = "+ name);
        System.out.println("age = "+ age + "\n");
    }
}


class Test
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.showInfo();

        Student student2 = new Student("Oleg", 35);
        student2.showInfo();

        Student student3 = new Student(19);
        student3.showInfo();


    }
}