package lesson_11;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        int[] ar = new int[]{1, -5, 6, 3, 10};
        System.out.println(ar);

        System.out.println( Arrays.toString(ar));

        Arrays.sort(ar);

        System.out.println( Arrays.toString(ar));

        String[] ar2 = new String[]{"fafas", "asdadsa", "mmmmmasdad"};
        Arrays.sort(ar2);

        System.out.println( Arrays.toString(ar2));

        Human[] ar3 = new Human[]{new Human(2, 18, "illia"), new Human(1, 21, "ivan"), new Human(3, 25, "oleg")};
        Arrays.sort(ar3);
        System.out.println( Arrays.toString(ar3));

        ///
        List<Integer> integerList = new ArrayList<>();

        // integerList = new LinkedList<>();


        integerList.add(6);
        integerList.add(1);
        integerList.add(0);
        integerList.add(12);


        Collections.sort(integerList);

        System.out.println(integerList);


//        A human = new Human(1, 18, "illia");
//        human.method1();

        // /////////////////////

        List<Human> humans = new ArrayList<>();
        humans.add(new Human(10, 31, "ivan"));
        humans.add(new Human(2, 21, "ol"));
        humans.add(new Human(4, 17, "i"));
        humans.add(new Human(1, 45, "Illiartrtr"));

        Collections.sort(humans);
        System.out.println(humans);


        NameComparator nameComparator = new NameComparator();
        Collections.sort(humans, nameComparator);
        System.out.println(humans);


        /////
        A<Integer> integerA = new A<>();
        integerA.t = 9;



    }



}

class A<T>
{
    T t;
}

class NameComparator implements Comparator<Human>
{

    @Override
    public int compare(Human o1, Human o2)
    {
        return o1.getName().compareTo(o2.getName());
        //return o1.getName().length() - o2.getName().length();
    }
}
class Human implements  Comparable<Human>{
    private int id;
    private int age;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public void method2() {

    }


    //
    @Override
    public int compareTo(Human another)
    { // 16 10
//        if(this.age > another.age)
//        {
//            return 1;
//        }
//        else if (this.age < another.age)
//        {
//            return -1;
//        }
//        else
//        {
//            return 0;
//        }

        Integer integer = 7;
        Integer integer2 = 9;
        integer.compareTo(integer2);

       return this.age - another.age;
        // return this.age.compareTo(another.age);

    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}