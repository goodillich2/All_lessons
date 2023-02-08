package lesson_7.task_10;

public class Product
{
    private String name;
    private int value;
    private int rating;

    public Product(String name, int value, int rating) {
        this.name = name;
        this.value = value;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", rating=" + rating +
                '}';
    }

}
