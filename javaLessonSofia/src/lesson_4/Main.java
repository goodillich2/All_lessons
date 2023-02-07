package lesson_4;

public class Main
{
    public static void main(String[] args) {
        // modifiers: private public protected default ( class below )
        // private ( методы, поля, конструкторы) - доступно в пределах класса
        // public (все может быть паблик) - доступно везде
        //  default (все может быть default) доступно в предела пакета(папка)
        //

       //  Test test = new Test();  wrong because private constructor
        Test test = Test.createObject();
       //  test.test
    }
}


class Test
{
    private int age;


    private Test()
    {

    }

    public static Test createObject()
    {
        Test test = new Test();
        return test;
    }


    public void test(){
        age = 19;
        System.out.println(age);
    }


}
