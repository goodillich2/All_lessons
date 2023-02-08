package lesson_2;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
    public static void main(String[] args) {

        //stack (i = 5)  dog1(addres)                                                str1 (addres)
        //                    |                                                             |
        //heap         new Dog() (name = "aaa" age = 7)    new String("str1")    new String("str2")


        int[] ar = new int[3];

        Random random = new Random();           // 0  1  2
        for (int i = 0; i < ar.length; i++) {   //[0, 0, 0]
            ar[i] = random.nextInt(10);
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        //нет метода toString()
        System.out.println(ar);
        System.out.println(Arrays.toString(ar));

                                        //    0        1       2       3
        int[][] array = new int[4][2]; // [ [1, 5], [8, 4], [8, 4], [8, 4]

        for (int i = 0; i < array.length; i++) { // 0 1 2 3  i = 0
                                    // 2
            for (int j = 0; j < array[i].length; j++) {   // array[0] = [1, 5]
                array[i][j]  = random.nextInt(15);
            }
        }

//        [ [1, 5],
//          [8, 4],
//          [8, 4],
//          [8, 4] ]

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) { // 0 1 2 3  i = 0
            // 2
            for (int j = 0; j < array[i].length; j++) {   // array[0] = [1, 5]
                System.out.print(array[i][j] + " ");;
            }
            System.out.println("\n");
        }


    }
}
