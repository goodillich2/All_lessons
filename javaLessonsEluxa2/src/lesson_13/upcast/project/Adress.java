package lesson_13.upcast.project;

import java.util.Objects;

public class Adress
{
    private String street;
    private int house;

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

    public Adress(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public Adress() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return house == adress.house && Objects.equals(street, adress.street);
    }


    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", house=" + house +
                '}';
    }

}
