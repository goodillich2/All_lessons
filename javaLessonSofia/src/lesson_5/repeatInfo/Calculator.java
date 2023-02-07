package lesson_5.repeatInfo;

public class Calculator
{
     int min(int a, int b)
    {
        if(a < b)
        {
            return a;
        }
        else if (b < a)
        {
            return b;
        }
        else
        {
            return a;
        }
    }

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

    int sqrt(int a)
    {
         return a * a;
    }

}


class Test2{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println(calc.min(5, 6));

         boolean res =  calc.isOdd(5);
        System.out.println(res);


        int resOfSqrt = calc.sqrt(5);
        System.out.println(resOfSqrt);
    }
}
