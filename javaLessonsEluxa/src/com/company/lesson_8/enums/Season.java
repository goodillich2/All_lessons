package com.company.lesson_8.enums;

public enum Season {
    WINTER(0), SUMMER(25), AUTUMN(10), SPRING(15);

    private int avgTemp;

    Season(int avrTemp) {
        this.avgTemp = avrTemp;
    }

    Season() {
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(int avgTemp) {
        this.avgTemp = avgTemp;
    }
}

class SeasonClass{
    private String name;
    private int avgTemp;

    public SeasonClass(String name, int avgTemp) {
        this.name = name;
        this.avgTemp = avgTemp;
    }

    public SeasonClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(int avgTemp) {
        this.avgTemp = avgTemp;
    }
}
