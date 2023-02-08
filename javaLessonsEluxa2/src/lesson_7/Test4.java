package lesson_7;

public class Test4 {
    public static void main(String[] args) {
//                           //0 1 2 3

        try {
            int[] ar = new int[]{1,3,4,5};
            for (int i = 0; i < ar.length + 1; i++) {
                System.out.println(ar[i]);
            }
        }
        catch (ArithmeticException e){
            System.out.println("ошибка...");
        }




    }
}
