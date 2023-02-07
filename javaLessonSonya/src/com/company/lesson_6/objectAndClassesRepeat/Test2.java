package com.company.lesson_6.objectAndClassesRepeat;

public class Test2 {
    public static void main(String[] args) {
        Math obj = new Math();
        int sum1 =  obj.sum(5, 10);
        System.out.println("sum = " + sum1);
        int res = obj.pow(2, 4);
       System.out.println("2^4 = " + res);

    }
}

class Math {

    // z = x + y
    int sum(int x, int y)
    {
        return x + y;
    }

    // z = x^y
    //     5^3 = 5*5*5
    int pow(int x, int y)   //  Math obj = new Math();  obj.pow(5, 3)
    {

        int result = 1;
        //          0   i < 3
        for (int i = 0; i < y; i++)
        {
            result = result * x;  // result = 1 *  5 = 5; result =  5 * 5 = 25; result =  25 * 5 = 125;
        }

        return result;
    }

}
