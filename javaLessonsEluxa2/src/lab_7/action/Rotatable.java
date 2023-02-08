package lab_7.action;

public interface Rotatable extends Movable
{
    public static final int stepAngle = 90;
    abstract public void rotateForward();
    abstract public void rotateBackward();
}
