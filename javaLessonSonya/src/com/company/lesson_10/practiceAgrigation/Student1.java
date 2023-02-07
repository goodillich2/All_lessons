package com.company.lesson_10.practiceAgrigation;

public class Student1
{
    private String name;
    private int age;

    public Student1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Student1()
    {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo()
    {
        System.out.println("name = "+ name);
        System.out.println("age = "+ age + "\n");
    }


}
