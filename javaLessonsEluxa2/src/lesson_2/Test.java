package lesson_2;

public class Test {

    public static void main(String[] args) {
        Car audi = new Car();

        audi.year = 2020;
        audi.name = "Q";
        audi.hp = 100;

        audi.carAge(2022);
        audi.printInfo();

        Car bmw = new Car();

        bmw.year = 2018;
        bmw.name = "x";
        bmw.hp = 110;

        bmw.carAge(2022);
        bmw.printInfo();

    }
}


