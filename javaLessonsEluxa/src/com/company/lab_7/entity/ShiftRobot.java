package com.company.lab_7.entity;

import com.company.lab_7.action.Rotatable;
import com.company.lab_7.action.Shiftable;

public class ShiftRobot extends Robot implements Shiftable
{
private int startPos;
private int endPos;


    public ShiftRobot() {
    }

    public ShiftRobot(int x, int y, int course, int startPos, int endPos) {
        super(x, y, course);
        this.startPos = startPos;
        this.endPos = endPos;
    }

    public ShiftRobot(int startPos, int endPos) {
        this.startPos = startPos;
        this.endPos = endPos;
    }

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public int getEndPos() {
        return endPos;
    }

    public void setEndPos(int endPos) {
        this.endPos = endPos;
    }

    @Override
    public void doSomething()
    {
        System.out.println("ShiftRobot go");
    }

    @Override
    public void move() {
        System.out.println("robot goes forward:");
        while (getX() < endPos){
            shiftForward();
        }
        System.out.println("\nrobot goes backward:");
        while (getX() > startPos){
            shiftBackward();
        }

    }

    @Override
    public void shiftForward()
    {

           setX(getX() + stepShift);
           doSomething();


    }

    @Override
    public void shiftBackward() {
        setX(getX() - stepShift);
        doSomething();

    }
}

class Test1
{
    public static void main(String[] args)
    {
        ShiftRobot shiftRobot = new ShiftRobot(0,5);
        shiftRobot.move();
    }
}
