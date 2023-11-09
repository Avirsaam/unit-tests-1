package Shop;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    /*
  1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
  2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
  3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
  */


    private Shop shop;
    List<Product> testProductList;

    Product mostExpensiveProduct = new Product("Самый дорогой", 1000);
    Product justProduct = new Product("Средняя цена", 100);
    Product lessExpensiveProduct = new Product("Самый дешевый", 10);


    @BeforeEach
    void setUp() {
        testProductList = new ArrayList<>(Arrays.asList(justProduct, mostExpensiveProduct, lessExpensiveProduct));

        shop = new Shop();
        shop.setProducts(testProductList);
    }

    @Test
    @DisplayName("Проверка верности списка продуктов")
    void testCorrectProductList(){
        assertArrayEquals(testProductList.toArray(), shop.getProducts().toArray());
    }

    @Test
    @DisplayName("Проверка выборки самого дорогого из продуктов")
    void testMostExpensive(){
        assertEquals(shop.getMostExpensiveProduct(), mostExpensiveProduct);
    }

    @Test
    @DisplayName("Проверка сортировки по возрастанию цены")
    void testPriceSortAccending(){
        List<Product> sortedArray = new ArrayList<>(Arrays.asList(lessExpensiveProduct, justProduct, mostExpensiveProduct));
        assertArrayEquals(sortedArray.toArray(), shop.sortProductsByPrice().toArray());
    }

}
