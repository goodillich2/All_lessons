package lesson_13.upcast.project;

import java.util.Objects;

public class Student implements Comparable<Student>
{
    private String name;
    private Date date;
    private Adress adress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Student(String name, Date date, Adress adress) {
        this.name = name;
        this.date = date;
        this.adress = adress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", adress=" + adress +
                '}';
    }


    @Override
    public int compareTo(Student o1) {

        return this.name.length() - o1.getName().length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && date.equals(student.date) && adress.equals(student.adress);
    }

//    public static void main(String[] args) {
//        Student s = new Student();
//        Student s2 = new Student();
//        System.out.println(s.equals(s2));
//    }

}
