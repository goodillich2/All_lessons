package lesson_5.finalPart;

public class Test {
    public static void main(String[] args) {
        //явное неявное преобразование примитивов
        int a = 5;
        double b = a;


        double c = 10;
        int d = (int)c;
        int n = 5;
        byte j = (byte) n;

        //Double Boolean Integer Float Character
        Integer integer = new Integer(50);
        Integer integer1 =  Integer.valueOf("123");
//      int p =  Integer.valueOf("123");
        //автоупаковка
        Integer integer2 = 50;
        //автораспаковка
        int y = integer2;
    }
}
