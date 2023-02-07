package com.company.lesson_6.hmPractice;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        2) создай массив с 20 элементов типа int, заполни его рандомными значениями.
//        ( все выводим через цикл)
//        Выведи все элементы массива
//        Выведи только те элементы, которые имеют парный индекс( внимательно именно индекс, а не значение)
//        Потом выведи элементы массива начиная с 5 заканчивая 10 индексом.
//                Потом выведи элементы массива начиная с 12 заканчивая 3 индексом.


        Random random = new Random();
        System.out.println("Homework2");
        int [] mass5 = new int [20];
        for (int g = 0; g < mass5.length; g = g + 1){
            mass5[g] = random.nextInt(20);
        }
        for (int g = 0; g < mass5.length; g = g + 1){
            System.out.println(mass5[g] + "");
        }

        // [0,1,2,3]
        // [5,6,7,16]


        for (int g = 0; g < mass5.length; g = g + 1){
            if (g % 2 == 0)
            {
                System.out.println("Index = " + g);
                System.out.println(mass5[g] + " - элемент с парным индексом");
            }
        }

        for (int i = 5; i <= 10 ; i++)
        {
            System.out.println(mass5[i]);
        }
//        System.out.println(mass5[5]);
//        System.out.println(mass5[6]);
//        System.out.println(mass5[7]);

        for (int i = 12; i >= 5 ; i = i - 1)
        {
            System.out.print(mass5[i] + " ");
        }



    }
}
