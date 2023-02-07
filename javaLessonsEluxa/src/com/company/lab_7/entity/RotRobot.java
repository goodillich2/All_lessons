package com.company.lab_7.entity;

import com.company.lab_7.action.Rotatable;

public class RotRobot extends Robot implements Rotatable
{
    private int startAngel;
    private int endAngel;

    public int getStartAngel() {
        return startAngel;
    }

    public void setStartAngel(int startAngel) {
        this.startAngel = startAngel;
    }

    public int getEndAngel() {
        return endAngel;
    }

    public void setEndAngel(int endAngel) {
        this.endAngel = endAngel;
    }

    public RotRobot() {
    }

    public RotRobot(int x, int y, int course, int startAngel, int endAngel) {
        super(x, y, course);
        this.startAngel = startAngel;
        this.endAngel = endAngel;
        setCourse(startAngel);
    }

    public RotRobot(int startAngel, int endAngel) {
        this.startAngel = startAngel;
        this.endAngel = endAngel;
        setCourse(startAngel);
    }

    @Override
    public void move() {
        //                   360
        int i = 1;
        while(getCourse() < endAngel){
            System.out.print("Step" + i + " ");
            rotateForward();
            i++;
        }

        //      360             0
        while(getCourse() > startAngel){
            System.out.print("Step" + i + " ");
            rotateBackward();
            i++;
        }
    }

    @Override
    public void rotateForward() {
       setCourse(getCourse() + stepAngle);
       doSomething();
    }

    @Override
    public void rotateBackward() {
        setCourse(getCourse() - stepAngle);
        doSomething();
    }

    @Override
    public void doSomething()
    {
        System.out.println("RotRobot go");
    }

}

class Test{
    public static void main(String[] args) {
        RotRobot rotRobot = new RotRobot(360, 720);
        rotRobot.move();
    }
}

