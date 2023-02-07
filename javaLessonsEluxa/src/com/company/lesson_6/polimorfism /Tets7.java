package com.company.lesson_6.polimorfism;

public class Tets7 {
    public static void main(String[] args) {
        com.company.lesson_6.polimorfism.Car car = new com.company.lesson_6.polimorfism.Car("BMW", "X6");
        car.drive();


        com.company.lesson_6.polimorfism.SportCar sportCar = new com.company.lesson_6.polimorfism.SportCar();
        sportCar.competeWithOtherCar();
        sportCar.drive();

        // Object -> Car -> SportCar
        com.company.lesson_6.polimorfism.Car car1 = new com.company.lesson_6.polimorfism.SportCar();
        car1.drive();

        com.company.lesson_6.polimorfism.Car car2 = new com.company.lesson_6.polimorfism.Car("audi", "a7");
        System.out.println(car2);

        System.out.println("\n\n\n");

        printInfo(car);
        printInfo(sportCar);  //Object(toString) -> Car(toString переопределили) -> Sportcar()


//         Object obj = new Car("srs", "sfdsd");
//         System.out.println(obj.toString());
//        Object obj2 = new SportCar();

//        Tets7.infoAboutCar(car2);
//
//
//        int a100 = 10;
//        int b100 = 15;
//        sum(a100, b100);
//        System.out.println("\n\n\n");
//
//        Car car3 = new Car("audi", "a8"); // stack      car3                       car
//                                                        // heap new Car("audi", "a8")
//        change(car3);
//        System.out.println(car3);
    }

                                        // car
    public static void printInfo(Object object){
        System.out.println(object.toString());
    }













//    public static void infoAboutCar(Car a){
//        System.out.println(a.toString());
//        a.drive();
//        a.getMake();
//    }
//
//    public static void change(Car car)
//    {
//        car.setMake("Mercedes");
//    }
//
//    public static int sum(int a, int b){
//       return a + b;
//    }





}
