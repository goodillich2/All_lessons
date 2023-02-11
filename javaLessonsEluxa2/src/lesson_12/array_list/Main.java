package lesson_12.array_list;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6); // 0
        integerList.add(6); // 1
        integerList.add(6); // 2

        System.out.println(integerList);

        List<Integer> copuOfIntegerList = new ArrayList<>(integerList);
        System.out.println(copuOfIntegerList);

        System.out.println(integerList == copuOfIntegerList);
        System.out.println(integerList.equals(copuOfIntegerList));

        integerList.remove(0);
        System.out.println(integerList);


        // [1,2,3,4,0]
        // [2, 1,2,3,4,0]

        List<Integer> integerList1 = new LinkedList<>();
        integerList1.add(7);
        integerList1.add(7);
        integerList1.add(7);

        printListX2(integerList);
        printListX2(integerList1);

        // method remove
        List<Human> humans = new ArrayList<>();
        Human human = new Human(7);

        humans.add(human);
        humans.add(new Human(20));
        humans.add(new Human(25));
        System.out.println(humans);

        humans.remove(human);

        humans.remove(new Human(25)); // method equals
        System.out.println(humans);

        // Vector and Stack
        List<Integer> vector = new Vector<>(); // = ArrayList ( но лучше не использывать)
        vector.add(7);
        vector.remove(0);



        Stack<Integer> doubleStack = new Stack<>();

        doubleStack.add(5);
        doubleStack.add(7);
        doubleStack.add(9);

        System.out.println(doubleStack);
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack);

        while (!doubleStack.isEmpty())
        {
            System.out.println(doubleStack.pop());
        }

        System.out.println(doubleStack);


    }


    public static void printListX2(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) * 2 + " " );
        }
        System.out.println();
    }



}


class Human
{
    int age;

    public Human(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

    // equals from Object


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age;
    }

}

 class ArrayList2{
    int[] ar;

    public ArrayList2()
    {
        ar = new int[10];
    }

    public void add(){

    }

 }