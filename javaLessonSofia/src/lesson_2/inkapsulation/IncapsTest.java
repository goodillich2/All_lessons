package lesson_2.inkapsulation;

public class IncapsTest {
    public static void main(String[] args) {
        Animal cat = new Animal();
        //cat.age = -100;
        //cat.name = "Lusha";
        cat.setAge(7);
        cat.setName("Lusha");
        cat.setAge(100);

        System.out.println("name of animal = " + cat.getName() );
        System.out.println("age of animal = " + cat.getAge() );
        Car car = new Car();
    }
}


class Animal
{
    private int age; // поле
    private String name; // поле
    //String colour;

    // setter and getters
     void setAge(int age){
        if(age > 0)
        {
            this.age = age;
        }

    }

    void setName(String name){
        this.name = name;
    }

    int getAge()
    {

         return age;
    }

    String getName(){
        return name;
    }

}


class Car
{
    // modifiers -> public, private, default
    private int speed;
    private String vendor;

    // command + N = generate

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}



class University {

    private String name;
    private String major;
    private int grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Test4{
    public static void main(String[] args) {
        University KPI = new University();
        KPI.setName("KPI");
        KPI.getGrade();
    }
}




