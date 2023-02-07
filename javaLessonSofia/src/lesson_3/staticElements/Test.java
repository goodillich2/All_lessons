package lesson_3.staticElements;

public class Test {
    public static void main(String[] args) {
        // обычные переменные(поля) относяться к обьекту
        // статические переменные(поля) - общие и относяться к классу

  //      Human.description = "этот класс нужен для описания человека";
//        Human human = new Human();
//        human.printInfo();
//        System.out.println(Human.description);
//        Human.description = "этот класс нужен для описания человека";

        System.out.println(Human.countOfPeople);

        Human.helloWorld();

        Human human = new Human();
        Human human2 = new Human(15, "Oleg");
        Human human3 = new Human();
        human.printInfo();



        System.out.println(Human.countOfPeople);

        // пример использывания статик функций: класс Math (сборник полезных функций)
        int res1 = Math.max(6, 10);
        double res2 =  Math.pow(5, 2);

        System.out.println("Max of 6 and 10 = " + res1);
        System.out.println("pow(5,2) = " + res2);


        int res3 = Math.max(6, 10);
        double res4 =  Math.pow(5, 2);

        System.out.println("Max of 6 and 10 = " + res3);
        System.out.println("pow(5,2) = " + res4);


    }
}

class Human
{
    private int age;
    private String name;
    static String description;

    static int countOfPeople = 0;

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

    public Human(int age, String name) {
        countOfPeople++;
        this.age = age;
        this.name = name;
    }

    public Human() {

        countOfPeople = countOfPeople + 1;
    }

    void test()
    {
        System.out.println("Hello from function test");
    }

    void printInfo()
    {
        // test();
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        description = "new description";
        System.out.println();
    }

    static void helloWorld()
    {
        System.out.println("Hello world !!!" + description  );
    }

}

class newMath{

    static int max(int x, int y )
    {
        if(x > y)
        {
            return x;
        }
        else if(x < y)
        {
            return y;
        }
        else
        {
            return x;
        }
    }

    // pow(5, 3)  5^3 = 5 * 5 * 5
    static double pow(int x, int y)
    {
        int res = 1; // 5

        for (int i = 1; i <= y; i++)
        {
            res = res * x; // res = 1 * 5 = 5   // res = 5 * 5 = 25 // res = 25 * 5 = 125
        }

        return res;
    }
}




