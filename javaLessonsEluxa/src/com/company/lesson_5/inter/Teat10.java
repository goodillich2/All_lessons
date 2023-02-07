package com.company.lesson_5.inter;

import com.company.lesson_4.Human1;

public class Teat10 {
    public static void main(String[] args) {

        Animal5 animal2 = new Animal5();
//        animal2.sleep();
//        animal2.eat();
        Human5 human5 = new Human5();
//        human5.sleep();
//        human5.eat();


        eatInfo(animal2);
        eatInfo(human5);


    }

    public static void eatInfo(AbleToDoSomething ableToDoSomething){
        ableToDoSomething.eat();
    }

//    public static void eatAnimalInfo(Animal5 animal5){
//        animal5.eat();
//    }
//
//    public static void eatHumanInfo(Human5){
//        animal5.eat();
//    }

}
