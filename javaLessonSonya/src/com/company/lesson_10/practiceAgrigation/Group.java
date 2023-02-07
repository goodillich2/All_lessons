package com.company.lesson_10.practiceAgrigation;

public class Group
{
    private String name;
    private Student1[] student1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1[] getStudent1() {
        return student1;
    }

    public void setStudent1(Student1[] student1) {
        this.student1 = student1;
    }

    public void showInfo()
    {
        System.out.println("name of group = " + name);
        System.out.println("Group has students: ");
        for (int i = 0; i < student1.length; i++)
        {
            student1[i].showInfo();
        }
    }
}



class Test
{
    public static void main(String[] args)
    {

        Student1 student1 = new Student1("Alya", 17);
        Student1 student2 = new Student1("Ivan", 19);
        Student1 student3 = new Student1("Kirill", 20);


        Student1[] students = new Student1[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Group group = new Group();
        group.setName("KM-01");
        group.setStudent1(students);

        group.showInfo();
        System.out.println("\n\n");



        ///////////////////////////////////////////////////////////////////////////
//        int[] ar = new int[3];
//        ar[0] = 5;
//        ar[1] = 1;
//        ar[2] = 7;
//
//        for (int i = 0; i < ar.length; i++)
//        {
//            System.out.print(ar[i] + " ");
//        }
//        String[] names = new String[]{"asqae", "erer"};
//
//
//        Student1 student1 = new Student1("Alya", 17);
//        Student1 student2 = new Student1("Ivan", 19);
//        Student1 student3 = new Student1("Kirill", 20);
//
//
//        Student1[] students = new Student1[3];
//        students[0] = student1;
//        students[1] = student2;
//        students[2] = student3;
//
//        System.out.println("\n");
//
//        for (int i = 0; i < students.length; i++)
//        {
//            students[i].showInfo();
//        }

    }
}
