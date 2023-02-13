package lesson_13.upcast.project;

import java.util.ArrayList;

public class Group {

    private String name;
    private ArrayList<Student> students ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(String name)
    {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public Group(String name, ArrayList<Student> students)
    {
        this.name = name;
        this.students = students;
    }

    @Override
    public String toString()
    {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void printStudent()
    {
        for (int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i));
        }
    }

    // remove student
    // void принимает Student student
    public void removeStudent(Student student){
        students.remove(student);  // equals
    }

    //sort students


}

class T{
    public static void main(String[] args) {


        Group group2 = new Group("A-533");
        group2.addStudent(new Student("Ilya", new Date(2003, 5,13), new Adress("Lobanovskogo", 26)));
        group2.addStudent(new Student("Nikita", new Date(2003, 5,15), new Adress("Lobanovskogo", 23)));
        System.out.println(group2);

        Student student = new Student("Ilya", new Date(2003, 5,13), new Adress("Lobanovskogo", 26));
        group2.removeStudent(student);
        System.out.println(group2);



        Group group1 = new Group("a-01");
        group1.addStudent(new Student("Nikita", new Date(2003, 5,15), new Adress("Lobanovskogo", 23)));




        // ne nado
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        Group group = new Group("Km-01", students);

    }
}