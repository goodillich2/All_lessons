package lab_7.entity;

import java.util.Locale;

public  class Robot
{
    private int x;
    private int y;
    private int course = 0;

    public void doSomething()
    {
        System.out.println("Robot go");
    }

    public int getX() {
        return x;
    }

    public  void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Robot(int x, int y, int course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot() {
    }

    public static void main(String[] args) {
        Robot robot = new Robot(3, 3,  10);
        String s = "sdfss";
        System.out.println(s);

        String s3 = s.toUpperCase(Locale.ROOT);
        System.out.println(s3);


    }
}
