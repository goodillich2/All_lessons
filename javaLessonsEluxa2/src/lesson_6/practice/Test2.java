package lesson_6.practice;

public class Test2 {
    public static void main(String[] args)
    {
//        Printable book = new Book();
//        Printable mag = new Magazine();

//        Book[] books = new Book[2];
//        Book book1 = new Book();
//        Book book2 = new Book();
//        books[0] = book1;
//        books[1] = book2;

        //  0   1   2   3
        // [2 , 3 , 5, 7]   size m= 4
        Printable[] mass = new Printable[4];

//        int[] ar = new int[4];
//        ar[0] = 5;
//        ar[0] = 6;
//        ar[0] = 7;
//        ar[0] = 8;
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = i;
//        }

        Book book1 = new Book();
        Book book2 = new Book();
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = new Magazine();
        mass[0] = book1;
        mass[1] = book2;
        mass[2] = magazine1;
        mass[3] = magazine2;

        for (int i = 0; i < mass.length; i++)
        {
            mass[i].print();
        }


    }
}
