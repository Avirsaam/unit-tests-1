package Shop;

import java.util.*;

public class Shop {
    private List<Product> products;

    public Shop(){
        products = new ArrayList<>();
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        if (products.size() > 0) {
            Collections.sort(products);
            return products;
        }
        else {
            throw new RuntimeException("Список продуктов пуст!");
        }

    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products.size() > 0) {
            Product mostExpensive = products.get(0);
            for (Product p : products) {
                if (p.getCost() > mostExpensive.getCost())
                        mostExpensive = p;
            }
            return mostExpensive;
        }
        else {
            throw new RuntimeException("Список продуктов пуст!");
        }

    }

}
