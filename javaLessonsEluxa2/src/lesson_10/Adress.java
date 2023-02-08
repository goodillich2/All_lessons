package lesson_10;

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
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
