package Shop;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost);
    }

    public Product(String title, Integer cost){
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Product p) {
        return this.cost - p.getCost();
    }
}