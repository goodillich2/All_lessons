package com.company.hm;

public class Circle
{
    private int r;  
    private int x;
    private int y;

    public void setR(int r)
    {
        this.r = r;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getR()
    {
        return r;                   // Circle circle = new Circle(10, 5, 7); circle.getR();  circle.setR(10);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Circle()
    {

    }

    public Circle(int r, int x, int y)
    {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double square()
    {
        return 3.14 * r * r;
    }

    public double length()
    {
        return 2 * 3.14 * r;   
    }
}


// type_return nameOfMethod(parametr, )