package com.company.lesson_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {

        //checked(compile) unchecked(во время запуска)
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;


        while (flag){
            try {
                System.out.println("Введите название файла: ");
                File file = new File(scanner.nextLine());
                Scanner scanner2 = new Scanner(file);
                flag = false;
            } catch (FileNotFoundException e) {
                e.printStackTrace(); //выводит дефолнтное сообщение об ошибке
            }
        }

        System.out.println("after try catch block");




        int a = 5/0;



//        String s = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(s2);

//        while (scanner.hasNextLine()){
//             String[] ar =  scanner.nextLine().split("e");
//             System.out.println(Arrays.toString(ar));
//        }
    }
}
