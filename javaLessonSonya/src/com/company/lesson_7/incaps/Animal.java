package com.company.lesson_7.incaps;

public class Animal {
    private String type;
    private int age;

    void printInfo()
    {
        System.out.println("type = " + type);
        System.out.println("age = " + age);
    }

    void setAge(int age1)
    {
        if(age1 >= 0)
        {
            this.age = age1;
            System.out.println("All good");
        }
        else
        {
            System.out.println("Error");
        }

    }

    void setType(String type1)
    {

//        if(type1 != "")
//        {
//            this.type = type1;
//        }

        if(type1 != "dog")
        {
            this.type = type1;
        }

    }

    int getAge()
    {
        return age;
    }

    String getType()
    {
        return type;
    }



}


class Test
{
    public static void main(String[] args) {

        // до инкапсуляции
//        Animal cat = new Animal();
//        cat.type = "cat";
//        cat.age = -7;
//        cat.printInfo();
     //   System.out.println(cat.age);


        // с использыванием инкапсуляции
        // если перед полем мы ставим private - то теперь это поле доступно только внутри класса
        // чтобы теперь у нас была возможность записывать в наши поля информацию и получать данные с наших полей - нам нужны сеттеры/геттеры
        // сеттеры/геттеры - это обычные методы
        // с помощью сеттера мы записываем какое-то значение в поле обьекта
        // с помощью геттера мы получаем какое-то значение  полей обьекта

        Animal cat = new Animal(); // создали обьект

        cat.setAge(-7); // вызываем 1 раз сеттер
        System.out.println();

        cat.setAge(7);
        cat.setAge(-19);
        cat.setAge(-11);
        cat.setAge(11);
        cat.setAge(-1);
        cat.setAge(0);
        cat.setAge(-5);

        cat.setType("cat");
        cat.setType("cat");
        cat.setType("dog");
        System.out.println();


        int age2 = cat.getAge();
        System.out.println(age2);


        String type1 = cat.getType();
        System.out.println(type1);


    }
}


