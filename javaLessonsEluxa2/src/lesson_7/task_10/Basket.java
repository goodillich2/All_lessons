package lesson_7.task_10;

import java.util.Arrays;

public class Basket
{
    private Product[] boughtProducts;

    public Basket(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public Product[] getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "boughtProducts=" + Arrays.toString(boughtProducts) +
                '}';
    }
}
