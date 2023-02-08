package hm;

public class Test
{
    public static void main(String[] args) {
        //       ref
        Circle circle1 = new Circle(2, 3, 4);
        circle1.length();
        circle1.square();

        Circle circle5 = new Circle(3,4,5);
        circle5.square();
        circle5.length();

        System.out.println("Square of circle 1 = " + circle1.square() + "\nLength of circle 5 = " + circle5.length() + "\n\n");
        System.out.println("Square of circle 5 = " + circle5.square() + "\nLenght of circle 1 = " + circle1.length() + "\n\n");

    }
    
    
    
}
