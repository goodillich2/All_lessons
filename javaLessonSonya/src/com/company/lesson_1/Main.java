package com.company.lesson_1;

public class Main {
    public static void main (String[] args)
    {
        int a = 5; // 5 + 7.5 = 12.5
        double b = 7.5;
        double c = a + b;
        System.out.println( "результат суммы = " + c);



        short s = 15;



        int q = 20;
        System.out.println("q before: " + q);
        q = q + 5;
        System.out.println("q before: " + q);


        char l = 's';
        System.out.println(l);

        boolean j = true;
        boolean f = false;
        boolean o = 5 > 1; // -> false;
        System.out.println("Variable j = " + j);


//        String s1 = "Helloooooo";
//        System.out.println(s1);



        byte d = 15;
        // мы будем выводить на экран d, если d > 15, в другом случае выводим ошибку
        // 10 > 15 -> false
        if(d > 15)
        {
            System.out.println("Variable > 15");
        }
        else if(d < 15)
        {
            System.out.println("Variable < 15");
        }
        else if(d == 15)
        {
            System.out.println("Variable = 15");
        }


    }
}
