package com.company.lesson_3;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Human human = new Human();
//        System.out.println("name of human = " + human.getName() + "\nage of human = " + human.getAge());
//        human.setName("dfddfdfd");
//        human.setAge(17);
//        System.out.println("name of human = " + human.getName() + "\nage of human = " + human.getAge());
//
//        Human human2 = new Human("Illia", 20);


        Human human = new Human(); // тут при создании обьекта вызыввется конструктор без параметров
        System.out.println("name of human = " + human.getName() + "\nage of human = " + human.getAge());
        System.out.println("\n\n");
        Human human2 = new Human("Illia", 19);// тут при создании обьекта вызыввется конструктор с параметрами
        System.out.println("name of human = " + human2.getName() + "\nage of human = " + human2.getAge());
//        System.out.println("name of human = " + human.getName() + "\nage of human = " + human.getAge());





    }
}

// публичный класс только один и = названею файла
// пишется с большой буквы

// modifiers: private, default, protected, public
// setter - изменяет атрибут/поле/переменная обьекта
// getter - получает инф. про атрибут
 class Human { // Human h = new Human(); h.setAge(17)
    // Human h2 = new Human(); h2.setAge(20)
    // h.age = 17;
    // sout(h.age)  sout(h.getAge())
    //  ctrl + n -> generate -> getters and setters (автогенерация)
    private String name;
    private int age;

    public Human(){
        System.out.println("Hello from 1 constructor");
    }
    //   всегда вызывается конструктор
    // Human h = new Human(); вызывем пустой конструткор
    // Human h2 = new Human("Ivan", 16); вызывем  конструткор c параметрами
    // конструктор - специальный метод, который нужен для того,
    // чтобы при создании обьекта сделать инециализацию полей
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello from 2 constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //isEmpty() return true if str is empty
        //isEmpty() return false if str not empty
        if(!name.isEmpty())
            this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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



