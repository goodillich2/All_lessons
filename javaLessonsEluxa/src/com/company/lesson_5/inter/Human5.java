package com.company.lesson_5.inter;

public class Human5 implements AbleToDoSomething{
    private int age;
    private String name;


    public void work(){
        System.out.println("I am working");
    }


    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}
