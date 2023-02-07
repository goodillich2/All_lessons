package lesson_3.constructors;

// файл может иметь только один публичный класс
public class Test2 {
    public static void main(String[] args) {
        // правила создания конструктора: название = названию класса
        //  у него нет возращаемого типа
        // нужны нам конструкторы для того, чтобы задать обьектам первончальные характеристики

        Human human = new Human(); // вызывается конструктор при создании обьекта
        human.printInfo();


        System.out.println("\n");
        Human human1 = new Human();
        human1.setName("Lilya");
        human1.setAge(31);
        human1.printInfo();


        System.out.println("\n");
        Human human3 = new Human(18, "Danya");
        human3.printInfo();

        System.out.println("\n");
        Human human4 = new Human(23);
        human4.setName("Vika");
        human4.printInfo();


        System.out.println("\n");
        // типы памяти в java: stack and heap
        //      stack        heap
        //      ref         new Human();
        //(адресс на обьект)
        Human human5 = new Human(35, "Nika");
        human5.printInfo();

        // создание ссылки Human human6
        // создание обьекта human6 = new Human();

        System.out.println("\n");
        Human human6 = human5;
        human6.printInfo();

        human5.setAge(30);

        human5.printInfo();
        human6.printInfo();

        int a = 10;






//        human.setAge(20);
//        human.setName("Oleg");
//        human.printInfo();


    }
}

// class
class Human {

    private int age;
    private String name;

    // constructor
    public Human()
    {
        this.age = 20;
        this.name = "Ivan";
        System.out.println("Hello from 1 constructor");
    }


    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println("Hello from 2 constructor");
    }

    public Human(int age)
    {
        this.age = age;
        System.out.println("Hello from 3 constructor");
    }

    // command + N + setter and getters


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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



}

