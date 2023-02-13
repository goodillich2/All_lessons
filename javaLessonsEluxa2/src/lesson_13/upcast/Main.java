package lesson_13.upcast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // upcasting
        Animal animal = new Dog();
        animal.eat();

//        List<Integer> a = new ArrayList<>();
//        List<Integer> a2 = new LinkedList<>();
//        List<Integer> a3 = new Stack<>();


        // down casting
        Object obj = new String("dfefef"); //  heap

        String str = (String) obj;

        Integer a = (Integer) obj;  //

        System.out.println(str.toUpperCase());
        System.out.println(a);


        Object[] ar = new Object[]{1, "erer"};

        Object o =  ar[0] ;


        Integer j = (Integer) o;



    }
}


class Animal{
    void eat(){

    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("dog is eating ");
    }

    void bark(){

    }
}

class Cat extends Animal{
    void miuu(){

    }
}