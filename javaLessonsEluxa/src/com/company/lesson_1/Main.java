package com.company.lesson_1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class Main {

    public static void main(String[] args) {


        //stack (i = 5)  dog1(addres)                                                str1 (addres)
        //                    |                                                             |
        //heap         new Dog() (name = "aaa" age = 7)    new String("str1")    new String("str2")


//        for (int j = 0; j < 100; j++) {
//            System.out.print(j + " ");
//        }


        int a = 0;

//        while (a<100) //
//        {
//
//            System.out.print( a + " ");
//
//            if(a == 5){ // a = 5
//                continue;
//            }
//        }




        //break; - завершает
        // continue;  - пропускает итерацию
                                //  0  1  2  3  4
        int[] arr = new int[10]; // [5, 0, 0, 7, 0]
                                //  |
                                // arr[0] = 5;  arr[3] = 7;


        // i = 0  ar[0] = 0; // [0, 0, 0, 0, 0]
        // i = 1  ar[1] = 1; // [0, 1, 0, 0, 0]
        // i = 2  ar[2] = 2; // [0, 1, 2, 0, 0]
        // i = 0  ar[0] = 0; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) { //fill array
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));


        // все элементы которые деляться на 2 %
        // 4 % 2 = 0 5 % 2 = 1  6%2 = 2 8%2 = 0

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }

        }

        int t = 50;
        System.out.println(++t);
        System.out.println(--t);

    }


}
