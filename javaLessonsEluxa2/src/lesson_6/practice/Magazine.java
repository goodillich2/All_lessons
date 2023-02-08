package lesson_6.practice;

public class Magazine implements Printable
{
    @Override
    public void print() {
        System.out.println("Сработал метод принт для журнала");
    }
}
