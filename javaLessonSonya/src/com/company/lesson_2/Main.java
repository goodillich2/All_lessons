package com.company.lesson_2;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world");

        int a = 5;
        int b = 10;

        int sum = a + b;
        System.out.println( "a + b = " + sum);
        // System.out.println( "a + b = " + (a + b));

        int div = b/a;
        System.out.println( "b/a = " + div);

        int div2 = a/b;
        System.out.println( "a/b = " + div2);

        int left = 10 % 3;
        System.out.println( "10 % 3 = " + left);

        // примитивы и ссылочные типы данных
        // s(ссылка -> "Hello!!!")
//        String s = "Hello!!!";
//
//        Person person = new Person();
//        person.age = 20;
//        person.name = "Oleh";
//
//        Person person2 = new Person();
//        person.age = 25;
//        person.name = "Anna";

        System.out.println("Hello world");

//        int a = 5;

        boolean j = (5 == 10);
        System.out.println(j);

//        int value = 5;
//
//        while (11 > 10){
//            System.out.println("body of cicle while");
//        }

        int value = 0;

        while (value < 5){
            System.out.println("body of cycle while: " + value);
            value = value + 1; //  value = 0 + 1 = 1 // value = 1 + 1 = 2
        }
        System.out.println("End of cycle while");

        for(int i = 0; i < 10; i = i + 1)
        {
            System.out.println("Body of for cycle " + i );
        }
        System.out.println("End of cycle for");

        // 0 - 100 -> будем выводить числа, которые делятся на 2
        // i = i + 1 -> i++;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

//        if(9 == 5 || 7==6 || 5 > 7 || 10 > 1){
//            System.out.println("Правда 1");
//        }
//
//        if(9 < 12){
//            System.out.println("Правда 2");
//        }
//        else{
//            System.out.println("ложь");
//        }


        // Необходимо вывести на экран числа от 1 до 5
        System.out.println("\n");
        for (int n = 1 ; n <= 5 ; n++)
        {
            if (n == 5)
            {
                System.out.print(n + ".");
            }
            else
            {
                System.out.print(n + ",");
            }
        }

        // Необходимо вывести на экран числа от 5 до 1.

        System.out.println("\n");
        //n-- -> n = n - 1
        for (int n = 5 ; n >= 1 ; n--)
        {
            if (n == 1 )
            {
                System.out.print(n + ".");
            }
            else {
                System.out.print(n + ",");

            }
        }

        // Необходимо вывести на экран таблицу умножения на 3:
//        3*1=3
//
//        3*2=6
//
//        3*3=9
//
//        ln
//
//        3*5=15
//
//        3*6=18
//
//        3*7=21
//
//        3*8=24
//
//        3*9=27
//
//        3*10=30

        System.out.println("\n");
        for (int l = 1 ; l <= 10 ; l++ )
        {
            System.out.println("3 * " + l + " = "  + l * 3 );
        }

    }
}
