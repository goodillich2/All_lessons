package lesson_5;

public class Person
{
    private int age;
    private String name;
    private Adress adress;

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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Person(int age, String name, Adress adress) {
        this.age = age;
        this.name = name;
        this.adress = adress;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}


class Test5{
    public static void main(String[] args) {
        Adress adress = new Adress("kyiv", "ozerna", 50, 12);
        Person person = new Person();
        person.setName("Oleg");
        person.setAdress(adress);
        person.setAge(20);
        System.out.println(person);
        adress.setCity("Odessa");
        System.out.println(person);

    }
}