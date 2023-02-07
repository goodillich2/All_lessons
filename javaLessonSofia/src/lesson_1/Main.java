package lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean a = 5 > 1;

        int s = 0;
        while (s <= 10){
            if(s != 10){
                System.out.print(s + ", ");
            }
            else{
                System.out.print(s);
            }
            s++; // s = s + 1
        }

        System.out.println("\n");
        int l = 10;
        while (l >= 0)
        {
            System.out.print(l + ", ");
            l--; // l = l - 1
            int b = 5;
        }

        System.out.println("\n");
        for (int i = 0; i <= 100; i = i + 5) {
            System.out.print(i + " ") ;
        }
        System.out.println("\n");
        for (int i = 10; i >= 0 ; i--) {
            System.out.print(i + " ");
        }


        System.out.println("\n");
        // 100 - 10 (парные)
        // %  10%7 = 3  10%2 = 0 11%2 = 1
        for (int i = 100; i >= 10; i--) {
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n");
        for (int i = 100; i >= 10; i--) {
            //
            if(i % 2 != 0){
                continue; // пропуск итерации
            }
            System.out.print(i + ", ");
        }

        int y = 0;
        while(true)
        {
            if(y == 100)
            {
                break;
            }
            System.out.println(y++);
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }



        int[] ar = new int[4];
        // 0  1  2  3
        //[0, 0, 0, 0]

        ar[0] = 10;
        ar[1] = 10;
        ar[2] = 12;
        ar[3] = 2;

        ar[3]  = 3;

        //[0, 1 ,2, 3 ,4]
        //[2, 3, 4, 5, 6]
        int[] ar2 = new int[]{2,3,4,5,6};
        System.out.println(ar2[2]);


        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));


        double[] ar3 = new double[]{2,5,6,9};
//        System.out.println(ar3[0]);
//        System.out.println(ar3[1]);
//        System.out.println(ar3[2]);
//        System.out.println(ar3[3]);
        for (int i = 0; i < ar3.length; i++) {
            if(ar3[i] % 2 == 0){
                System.out.println(ar3[i]);
            }
        }



        int[] array = new int[100];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
//        boolean[] f = new boolean[5];
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};

        String s2 = new String("hello");

        String[] strings = new String[]{"hello ", "hi", "privet"};
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }




        

    }
}
