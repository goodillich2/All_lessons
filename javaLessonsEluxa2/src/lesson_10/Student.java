package lesson_10;

public class Student
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
}
