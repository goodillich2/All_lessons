package lesson_8.collections;


import lesson_8.enums.Season;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        int[] ar = new int[10]; // [1,2,3,4,5] -> [1,2,4,5,0]
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i + 1;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }



        System.out.println("\n\n");
        System.out.println(ar);
        System.out.println("\n\n");
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i + 1);
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.print( integers.get(i) + " ");
        }
        System.out.println("\n\n");

        //0 1 2              9
        //1 2 3 4 5 6 7 8 9 10
        integers.remove(2);
        for (int i = 0; i < integers.size(); i++) {
            System.out.print( integers.get(i) + " ");
        }

        System.out.println("\n\n");
        System.out.println(integers.toString());

        boolean a = integers.isEmpty();


        System.out.println("\n\n");
        ArrayList<Season> seasons = new ArrayList<>();
        seasons.add(Season.AUTUMN);
        seasons.add(Season.SPRING);
        System.out.println(seasons);

        System.out.println("\n\n");
        ArrayList<Object> objects = new ArrayList<>();// = ArrayList objects = new ArrayList();
        objects.add("dfdfd");
        objects.add(1);
        System.out.println(objects);




//        B b = new A();
//        b.test();
        ArrayList doubles = new ArrayList();


        ArrayList doubles2 = new ArrayList();
        fillList(doubles2);
        System.out.println(doubles2);

        LinkedList linkedList = new LinkedList();
        fillList(linkedList);
        System.out.println(linkedList);


        List arrayList = new ArrayList();
        fillList(arrayList); // [1 2 3 4 ... 10]
        System.out.println(arrayList);

        arrayList = new LinkedList(arrayList);//[1 2 3 4 ... 10]
        arrayList = new ArrayList(arrayList);





    }

    public static void fillList(List list){
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }



}




