package com.company.lesson_5.hmPractice;

import java.util.Random;

public class Test {
    public static void main(String[] args)
    {
        //1.1 Создать массив типа int с 10 значений. Заполнить его через цикл рандомными значениями. Вывести данные массива через цикл задом наперед.
        //[0,1,2,3,4]
        //[1,2,4,8,9]
        System.out.println("Task-1:");
        int [] array = new int [10];
//        array[0] = 5;
//        array[1] = 5;
//        array[2] = 5;
//        array[3] = 5;
//        array[4] = 5;
//        array[5] = 5;
//        array[6] = 5;
//        array[7] = 5;
//        array[8] = 5;
//        array[9] = 5;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        Random random = new Random();

        // заполняем массив
        for (int a = 0; a < array.length; a = a + 1)
        {
            array[a] = random.nextInt(10);
        }


        // выводим массив в прямом порядке
        for (int i = 0; i < array.length; i = i + 1)
        {
            System.out.print(array[i] + " ");
        }


        System.out.println("\n");

        // выводим массив в обратном порядке
        for (int i = (array.length - 1); i >= 0; i = i - 1)
        {
            System.out.print(array[i] + " ");
        }

        // ------------ задание 2
        //1.2 создать массив типа double из 5 элементов,
        // самостоятельно его заполнить и вывести все непарные элементы массива через цикл
       //  int [] array = new int [10]; создаем массив
        // double - можем записать не целое число

        System.out.println("\nTask-2:");
        double [] test = new double [5];
        // обращаемся к элементам мы по названию
        test[0] = 1 ;
        test[1] = 2.5;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;


        for ( int i = 0; i < test.length ; i++)
        {
            if(test[i] % 2 != 0)
            {
                System.out.println(test[i] + " значение элемента не парное");
            }
            else
            {
                System.out.println(test[i] + " значение элемента  парное");
            }

        }

        //1.2.2 создать массив типа long из 5 элементов,
        // заполнить его рандомными значениями через цикл и вывести все  элементы массива,
        // которые /  5 через цикл
        System.out.println("\nTask-3:");
        long [] cat = new long [5];
//        cat[0] = random.nextInt(25);
//        cat[1] = random.nextInt(25);
//        cat[3] = random.nextInt(25);
//        cat[4] = random.nextInt(25);
//        cat[5] = random.nextInt(25);
        // цикл для заполнения массива
        for (int a = 0 ; a < cat.length ; a = a + 1 )
        {
            cat[a] = random.nextInt(25);
        }

        //  цикл для вывода элементов массива; не изменяем массив
        for ( int a = 0  ; a < cat.length ; a = a + 1)
        {
            if (cat[a] % 5 == 0)
            {
                System.out.println(cat[a] + "true");
            }
            else
            {
                System.out.println(cat[a] + "false");
            }

        }


        // 1.2.2 создай массив из 5 элементов типа int
        // заполни массив вручную
        // и выведи каждый второй элемент массива с конца(задам наперед)
        System.out.println("\nTask-4:");
        int [] mass = new int[5];
        mass [0]= 1;
        mass [1]= 5;
        mass [2]= 10;
        mass [3]= 15;
        mass [4]= 20;

        // mass.length = длине массива = 5
        for (int i = mass.length - 2; i >= 0  ; i = i - 2 )
        {
            System.out.println(mass[i]);
        }



        //  Потом выведи только первые 20 элементов массива и к каждому элементу дописывай информацию про парность и непарность числа

        System.out.println("Task2");
        long [] cake = new long [100];

        for (int l = 0; l< cake.length ; l++){
            cake[l]= random.nextInt(100);
//            System.out.println(cake[l]);
        }

        for (int l = 0; l <= 20 ; l++)
        {
            if(cake[l] % 2 == 0){
                System.out.print(cake[l] + " - парный; ");
            }
            else {
                System.out.print(cake[l] + " - непарный; ");
            }

        }

//        3) создай массив из 10 элементов рандомных числел и
//        попробуй посчитать сумму всех
//        элементов
//        ( такого не показывал, если не получится пиши, но это не сложно)
//        тоже через цикл и нужна доп переменная в которой будет сумма. ( если не получится ничего страшного)


        int[] ar = new int[]{5, 6, 8, 9};

                     //[0, 1, 2 ,3]
        int sum = 0; //[5, 6, 8, 9]

        System.out.println();

        for (int i = 0; i < ar.length; i++)
        {
            //                        0  =  0 + cake[0]
            // 1 iteration: sum = 0  sum = sum + cake[i];

            System.out.print("i = " + i + " ");
            System.out.print("el = " + ar[i] + " ");
            System.out.print("sum = " + sum);
            System.out.println();

            sum = sum + ar[i];

        }
        System.out.println("general sum = " + sum);


        for (int i = 100; i >= 0 ; i--)
        {
            if(i % 3 == 0)
            {
                System.out.println(i);
            }

        }

        // найти сумму последовательности от 5 до 35 только парных значений


        int generalSum = 0;

        for (int i = 5; i <= 35; i = i + 1)
        {
            if(i % 2 == 0)
            {
                generalSum = generalSum + i;
            }
        }
        System.out.println("sum of seq " + generalSum);


        // with while
        int generalSum2 = 0;
        int in = 5;

        while (in <= 35)
        {
            if(in % 2 == 0)
            {
                generalSum2 = generalSum2 + in;
            }
            in = in + 1;

        }
        System.out.println("sum of seq " + generalSum2);

















    }
}
