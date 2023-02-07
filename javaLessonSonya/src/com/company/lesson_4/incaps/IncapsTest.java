package com.company.lesson_4.incaps;

public class IncapsTest
{
    public static void main(String[] args)
    {
        Animal cat = new Animal();
        // problem of current approach
        //  cat.age = -10;
        // cat.age = 10;
        // cat.name = "Lusha";

        // инкапсуляция

        // cat.age = 10;
        // cat.name = "Lusha";
        //       |
        cat.setAge(10);
        cat.setName("Lusha");

//        String name = cat.getName();
//        System.out.println(name);
        System.out.println(cat.getName());

        System.out.println("\n");
        cat.printInfo();

        System.out.println("\n");
        cat.setAge(5);
        cat.printInfo();

        System.out.println("\n");
        cat.setName("");
        cat.printInfo();






    }
}


class Animal
{
    private int age;
    private String name;

    // setter anf getter
    void setAge(int age1)
    {
        if(age1 > 0)
        {
            age = age1;
        }
        else
        {
            System.out.println("wrong!");
        }

    }

    void setName(String name1)
    {
        if(name1.isEmpty() == false)
        {
            name = name1;
        }
        else
        {
            System.out.println("You enter wrong");
        }

    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }



    void eat()
    {
        System.out.println("Animal is eating");
    }

    void printInfo()
    {
        System.out.println("My age is " + age);
        System.out.println("My name is " + name);
    }

}