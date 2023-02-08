package lab_7.action;

public interface Shiftable extends Movable
{
    public static final int stepShift = 1;
    public void shiftForward();
    public void shiftBackward();
}



//abstract class Figure{
//    int x;
//    int y;
//    abstract int square();
//
//}


interface Square{
    abstract int square();
}


class Triangle implements Square{

     int x;
     int y;
     public static  double PI = 3.14;

    @Override
    public int square() {
        return x + y;
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}

class Test{
    public static void main(String[] args) {
         Triangle.PI = Triangle.PI + 1;
         System.out.println(Triangle.PI);
        System.out.println(Triangle.sum(5, 7));
//        Triangle triangle = new Triangle();
//        triangle.x = 5;
//        triangle.y = 7;

    }
}