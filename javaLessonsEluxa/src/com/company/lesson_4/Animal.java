package com.company.lesson_4;

import java.util.Objects;

public class Animal
{
    private int age;
    private String colour;

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public Animal() {
        System.out.println("Hello from Animal const without parameters");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    public  void eat()
    {
        System.out.println("Animal is eating");
    }


    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

//Dog sharick = new Dog();
// sharik.setBrief("dfdf");
 class Dog extends Animal    //Dog + Animal
 {
     private String brief;
     private String name;

     public Dog() {
         System.out.println("Hello from Dog const without parameters");
     }


     //Dog + Animal
     public Dog(int age, String colour, String brief, String name) {
         super(age, colour);
         this.brief = brief;
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void voice()
     {
         System.out.println("I am barking");
     }

     public String getBrief() {
         return brief;
     }

     public void setBrief(String brief) {
         this.brief = brief;

     }

     @Override
     public void sleep() {
         System.out.println("Dog is sleeping");
     }

     public void info()
    {
        System.out.println(brief + name + super.getColour()+ super.getAge());
    }

     @Override
     public String toString() {
         return "Dog{" +
                 "brief='" + brief + '\'' +
                 ", name='" + name + '\'' +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Dog dog = (Dog) o;
         return Objects.equals(brief, dog.brief) && Objects.equals(name, dog.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(brief, name);
     }
 }


//Object(toString, equals) -> Animal(toString, equals, sleep, eat) -> Dog(toString, equals, sleep, eat, bark) ->

 class Test1 {
     public static void main(String[] args) {

         //stack            dog    dog2
         //                  |      |
         //heap new Dog(10, "black", "brief1", "sharick")    new Dog(10, "black", "brief1", "sharick")
         Dog dog = new Dog(10, "black", "brief1", "sharick");
         Dog dog2 = new Dog(10, "black", "brief1", "sharick");
         System.out.println(dog);
         //            dog == dog2
         boolean a = (dog.equals(dog2) );
         System.out.println(a);


//         Animal animal = new Animal();
//         animal.eat();
//         animal.sleep();
//
//
//         Dog sharick = new Dog();
//         sharick.setAge(6);
//         System.out.println(sharick.getAge());
//
//            Dog sharick = new Dog();
//            sharick.setName("Sharick");
//            sharick.eat();
//            sharick.sleep();


//         Dog sharick = new Dog();
     }
 }


