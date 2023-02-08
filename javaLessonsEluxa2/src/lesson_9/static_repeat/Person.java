package lesson_9.static_repeat;

public class Person {
    private int age;
    static int count = 0;

    public void view(){
        System.out.println("age = " + age);

    }

    public static void sumOfAges(Person person, Person person1){
        System.out.println(person.getAge() + person1.getAge());
    }

    public static void divide(int a, int b){
//        System.out.println("age = " + age); false
        System.out.println( a/b);
        System.out.println(count);
        count+=10;  // count = count + 10;
        System.out.println(count);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }
}

class A{
    public static void sumOfAges(Person person, Person person1){
        System.out.println(person.getAge() + person1.getAge());
    }
}

class Test{


    public static void main(String[] args) {
        Person.divide(5,5);

    }


    public static int sum(int a, int b){
        return a + b;
    }
}