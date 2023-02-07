package com.company.Lesson8;


//1. Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//        Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//        Добавить конструктор без параметров.
//        Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone
{
    String number ;

    int weight ;

    String model ;


    void receiveCall(String name)
    {
        System.out.println("\nНа телефон " + model + " звонит " + name + "\n");

    }

    String getNumber()
    {
        return number ;

    }

    void printInfo ()
    {
        System.out.println("\nModel is " + model);
        System.out.println("Number is " + number );
        System.out.println("Weight is " + weight + "\n");

    }

}


class Test
{
    public static void main(String[] args)
    {
        Phone iphone = new Phone();
        iphone.model = "14 pro max";
        iphone.number = "053-553-3423";
        iphone.weight = 150;
        iphone.printInfo();
        iphone.receiveCall("Misha");
        iphone.receiveCall("Andrew");

         String name =  iphone.getNumber();
         System.out.println(name);






        Phone samsung = new Phone ();
        samsung.weight = 143 ;
        samsung.number = "054-342-5566" ;
        samsung.model = "S15" ;
        samsung.printInfo();
        samsung.receiveCall("lara");
        String name1 = samsung.getNumber();
        System.out.println(name1);

        Phone xiaomi = new Phone();
        xiaomi.model = "hr15";
        xiaomi.weight = 167 ;
        xiaomi.number = "032-566-4567";
        xiaomi.printInfo();
        xiaomi.receiveCall("Oleg");
        String name2 = xiaomi.getNumber();
        System.out.println(name2);





    }
}
