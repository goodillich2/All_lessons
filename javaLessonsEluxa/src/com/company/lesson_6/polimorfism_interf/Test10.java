package com.company.lesson_6.polimorfism_interf;

public class Test10 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.eat();

        AbleToSleep animal2 = new Animal();// сужение функционала класса Animal до методов интерфейса
        AbleToSleep person = new Person();
        animal2.sleep();
        person.sleep();

        System.out.println("\n\n\n");
        infoAboutAbleToSleepObject(animal2);
        infoAboutAbleToSleepObject(person);


        System.out.println("\n\n\n");
        Animal animal1 = new Animal();
        Person person1 = new Person();
        infoAboutAbleToSleepObject(animal1);
        infoAboutAbleToSleepObject(person1);




    }

//1. Интерфейс Printable
// 1 Определить интерфейс Printable, содержащий метод void print().
//            2 Определить класс Book, реализующий интерфейс Printable.
// 3 Определить класс Magazine, реализующий интерфейс Printable.
// 4 Создать массив типа Printable, который будет содержать книги и журналы.
// 5 В цикле пройти по массиву и вызвать метод print() для каждого объекта. 
//            6 Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов. 


    public static void infoAboutAbleToSleepObject(AbleToSleep ableToSleep){
        ableToSleep.sleep();
    }
}
