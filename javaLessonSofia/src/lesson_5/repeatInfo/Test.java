package lesson_5.repeatInfo;

public class Test
{
    public static void main(String[] args) {
//        int a = 5;
//
//        Human human = new Human();
//        human.age = 20;
//        human.name = "oleg";
//
//        human.printInfo();
//        human.getBirth();
//
//        int res = human.getBirth2();
//        System.out.println(res);
//
//
//        int res2 = human.getBirth3(2025);
//        System.out.println(res2);
//
//
//        System.out.println("\n");
//        Human human2 = new Human();
//        human2.age = 22;
//        human2.name = "vanya";
//        human2.printInfo();
//        human2.getBirth();
//
//
//        System.out.println("\n");
//        Human human3 = new Human();
//        human3.age = 30;
//        human3.name = "Galya";
//        human3.printInfo();
//        human3.getBirth();

        //------------------------------------------------------------------------------
        Human human4 = new Human();
        human4.setAge(15);
        human4.setName("Ivan");


        human4.printInfo();
        int age = human4.getAge();
        System.out.println(age);


        Human human5 = new Human();
        human5.setAge(22);
        human5.setName("Oleg");

        Human human6 = new Human("Petro", 33);





    }
}

class Human
{
    private String name;
    private int age;


    Human() // empty constructor
    {

    }


    Human(String name1, int age1) //  constructor with parameters
    {
        this.name = name1;
        this.age = age1;
    }


    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    void printInfo()
    {
        System.out.println("name of human = " + name);
        System.out.println("age of human = " + age);
    }

    void getBirth()
    {
        int result = 2023 - age;
        System.out.println("Birthday of human = " + result);
    }

    int getBirth2()
    {
        int result = 2023 - age;
        return result;
    }

    // y = x^2  x = 5  y = 5^2 = 25
    int getBirth3(int year)
    {
        int result = year - age;
        return result;
    }


}