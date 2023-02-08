package lesson_9.polimorfism;

public class Test {
    public static void main(String[] args) {
        B b = new B();
//        b.foo();
//        b.test();
    }
}

class A{
    public void foo(){
        System.out.println("foo");
    }
}

class B extends A{
    public void foo(){
        System.out.println("foo from A");
    }

    public void test(){
        System.out.println("test");
    }
}

interface C{
    abstract public void test();
}

class D implements C{

    @Override
    public void test() {

    }
}

abstract class F{
    
}