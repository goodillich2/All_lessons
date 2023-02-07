package com.company.lesson_9;

public class Test
{
    public static void main(String[] args)
    {

        Calculator calculator = new Calculator();
         int s =  calculator.minOfTwoNumber(9, 7);
        System.out.println(s);


       boolean res =  calculator.isOdd(10);
        System.out.println(res);


        calculator.isOdd2(6);


        int res2 =  calculator.pow(5);
        System.out.println(res2);


        int res3 =  calculator.cube(5);
        System.out.println(res3);



        int g = 5;
        int l = 4;
        int res4 = calculator.pow(5, 4); // 5^4
        System.out.println(res4);


        // [2,4,5] = 11
        int[] ar = new int[]{2,4,5};
        int[] ar2 = new int[]{7,1,2};
        int[] ar3 = new int[]{3,4,5};


//        int sum = 0;
//        for (int i = 0; i < ar.length; i++)
//        {
//            sum = sum + ar[i];
//        }
//
//        System.out.println(sum);

        int res5 =  calculator.sumElementOfArray(ar);
        System.out.println(res5);


        System.out.println(calculator.sumElementOfArray(ar2));
        System.out.println(calculator.sumElementOfArray(ar3));



    }
}



class Calculator
{



    // command + n + getter and setter



    // find sum of array
    int sumElementOfArray(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }


    // find min of 2 numbers
    int minOfTwoNumber(int a, int b)
    {
        if(a < b)
        {
            return a;
        }
        else if(b < a)
        {
            return b;
        }
        else
        {
            System.out.println("а = b");
            return -1;
        }

    }

    // verify if number is odd or not
    boolean isOdd(int a)
    {
        if(a % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    void isOdd2(int a)
    {
        if(a % 2 == 0)
        {
            System.out.println("number " + a + " is odd");
        }
        else
        {
            System.out.println("number " + a + " is not odd");
        }
    }

    int pow(int a)
    {
        return a*a;
    }


    int cube(int a) // pow(5)*5
    {
        return pow(a) * a;
    }

    int pow(int a, int b) // a^b   5^4  5*5*5*5*5
    {
        int res = 1;

        for (int i = 0; i < b; i++)
        {
            res = res * a;
        }
        return res;
    }




}
