package com.company.lesson_7.task_10;

import java.util.Scanner;

public class Test9
{
    public static void main(String[] args)
    {
        Product apple = new Product("aple", 5, 10);
        Product peach = new Product("peach", 7, 10);
        Product pineapple = new Product("pineaple", 20, 10);
        Product onion = new Product("onion", 3, 10);

        Product[] fr = new Product[]{apple, peach, pineapple, onion};
        Basket basket1 = new Basket(fr);
        User user1 = new User("login1", "password1", basket1);

//       int[] ar = new int[]{1,2,3,4,5};
        Product[] ar = new Product[]{apple, peach, pineapple, onion};
        int a = 5;
        switch (a){
            case (5):

        }
        Scanner scanner = new Scanner(System.in);
        scanner.close();



        Category fruits = new Category("fruits", ar);

        System.out.println("\n" + fruits);
        System.out.println(user1.toString());
    }
}
