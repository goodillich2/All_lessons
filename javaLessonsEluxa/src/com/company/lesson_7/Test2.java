package com.company.lesson_7;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            int x = scanner.nextInt();
            if(x <= 0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Вы ввели неправильно");
                }
            }
            else {
                flag = false;
            }
        }

    }
}
