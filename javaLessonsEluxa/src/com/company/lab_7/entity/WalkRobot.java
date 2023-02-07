package com.company.lab_7.entity;

import com.company.lab_7.action.Rotatable;
import com.company.lab_7.action.Shiftable;

public class WalkRobot extends Robot implements Rotatable, Shiftable
{

    @Override
    public void move() {

    }

    @Override
    public void rotateForward() {

    }

    @Override
    public void rotateBackward() {

    }

    @Override
    public void shiftForward() {

    }

    @Override
    public void shiftBackward() {

    }

    @Override
    public void doSomething(){
        System.out.println("WalkRobot go");
    }
}
