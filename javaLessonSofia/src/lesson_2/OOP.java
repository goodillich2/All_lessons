package lesson_2;

public class OOP {

    public static void main(String[] args) {

        Human illia = new Human();
        illia.age = 19;
        illia.name = "Illia";
//        System.out.println("Name of human = " + illia.name + "\nage of human = " +illia.age );


        System.out.println("\n");

        Human vasya = new Human();
        vasya.age = 25;
        vasya.name = "vasya";
//        System.out.println("Name of human = " + vasya.name + "\nage of human = " +vasya.age );

        // method function
        illia.printInfo();

        System.out.println("\n");
        vasya.printInfo();
        vasya.sayHello();

        System.out.println("\n");

        //
        int yearOfB = vasya.getYearOfBirth(2023);
        System.out.println("Year of birth " + vasya.name + " = " + yearOfB );

       int sum =  vasya.sum(5, 7);
       System.out.println(sum );


       // ООП = инкапсуляция, наследование, полиморфизм
        // инкапсуляция

    }
}

// чертеж
class Human {
    int age;
    String name;

    // void - ничего не возращает
    void sayHello()
    {
        System.out.println("Hello!!!");
    }

    void printInfo()
    {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }


    int getYearOfBirth(int currentYear)
    {
        System.out.println("Heloooooooooo");
        int year = currentYear - age;
        return year;
    }


    int sum(int a, int b)
    {
        return a + b;
    }



}