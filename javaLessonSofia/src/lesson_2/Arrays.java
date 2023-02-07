package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[][] ar = new int[2][3]; // [ [0,0,0], [0,0,0] ]


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //                      2
        for (int i = 0; i < ar.length; i++)
        {
            //                     3
            for (int j = 0; j < ar[i].length; j++)
            {
                ar[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
