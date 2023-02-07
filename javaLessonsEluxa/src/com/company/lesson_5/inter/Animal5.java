package com.company.lesson_5.inter;

public class Animal5 implements AbleToDoSomething{
    private String name;
    private String colour;

    public void bark(){
        System.out.println("I am barking");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}
