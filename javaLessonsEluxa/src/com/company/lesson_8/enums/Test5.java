package com.company.lesson_8.enums;

public class Test5 {

    public static void main(String[] args) {
        //SeasonClass seasonClass = new SeasonClass("WINTER", 0);
        Season season = Season.AUTUMN;
        Season season2 = Season.SPRING;
        Season season3 = Season.WINTER;
        System.out.println(season.getAvgTemp());
        System.out.println(season2.getAvgTemp());
        System.out.println(season3.getAvgTemp());

        // Object(toString) -> Enum(name(); compareTo();)  -> current enum
        Season season5 = Season.AUTUMN;
        System.out.println(season5.name());

        switch (season){
            case SUMMER:
                System.out.println("warm today");
            case WINTER:
                System.out.println("cold today");
        }


    }
}
