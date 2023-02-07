package com.company.lesson_4;


// private public default protected
// классы public, default
// поля public, default, private, protected
// методы public, default, private, protected

// константы - final
public class Human1 {
    private  String name;
    private int age;
    public static int count = 0;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Human1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human1() {
         Human1.sum(5, 6);
         count = count + 1;
    }


    public static int sum(int a, int b){
         return a + b + count ;
    }

    public static int aaaa(int c, int d){
         return c + d ;
    }

}

class Test{
    public static void main(String[] args) {
//        System.out.println(Human1.sum(5, 6));
//        Human1 human1 = new Human1();
//        System.out.println(Human1.PI + 5);
//        Math.pow(5,5);

//        Human1 human1 = new Human1();
//        //Object -> Human1
//        human1.toString();
//        System.out.println(human1);
        System.out.println(Human1.count);

    }
}
