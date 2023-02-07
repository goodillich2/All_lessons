package com.company.lesson_5;

public class Adress
{
    private String city;
    private String street;
    private int house;
    private int appartaments;

    public Adress() {
    }

    public Adress(String city, String street, int house, int appartaments) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.appartaments = appartaments;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getAppartaments() {
        return appartaments;
    }

    public void setAppartaments(int appartaments) {
        this.appartaments = appartaments;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", appartaments=" + appartaments +
                '}';
    }
}
