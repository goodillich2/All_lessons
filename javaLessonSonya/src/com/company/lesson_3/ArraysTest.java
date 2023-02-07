package com.company.lesson_3;

import java.util.Random;

public class ArraysTest {
    public static void main(String[] args) {



        // хранить 5 чисел типа int
        // массивы
        //  0  1  2  3  4
        //  |  |  |  |  |
        // [9, 2, 3, 9, 6]
        int[] array = new int[5]; //создали
        array[0] = 10;  // заполнение
        array[1] = 2;
        array[2] = 3;
        array[3] = 9;
        array[4] = 6;


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        for (int i = 0; i < 5; i++)
        {
            System.out.println(array[i]);
        }

        double[] mass = new double[10];
        mass[0] = 5.5;

        char[] mass2 = new char[3];
        mass2[0] = 1;
        mass[1]  = ';';
        mass[2]  = '4';

        // [0,1,2,3  4, 5, 6]
        // [0,0,0,0, 0, 0, 0]
        int[] ar = new int[7];

        // вывод массива
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }

        Random random = new Random();
        random.nextInt(50); // возращает случайное число
        // заполнение всех элементов массива случайными числами
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(50);
        }

        System.out.println("\n"); // перевод на новую строку
        // вывод массива
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }

        System.out.println("\n");
        // вывод ммассива наоборот
        for (int i = ar.length - 1; i >= 0 ; i--) {
            System.out.print(ar[i] + ", ");
        }

        System.out.println("\n");
        for (int i = 0; i < ar.length; i++) {
            if(i % 2 == 0){
                System.out.print(ar[i] + ", ");
            }
        }
    }
}
