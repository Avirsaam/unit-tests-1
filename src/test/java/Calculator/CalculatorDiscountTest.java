package Calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorDiscountTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка вычисления скидки")
    void testDiscountCalculation() {
        assertEquals(80, calculator.calculatingDiscount(100, 20));
    }

    @Test
    @DisplayName("Проверка отрицательной суммы покупки")
    void testNegativePurchaseAmount() {
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(-100, 50));
    }

    @Test
    @DisplayName("Проверка нулевой суммы покупки")
    void testZeroPurchaseAmount() {
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(0, 50));
    }

    @Test
    @DisplayName("Проверка отрицательной скидки")
    void testNegativeDiscountValue() {
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(100, -50));
    }

    @Test
    @DisplayName("Проверка скидки больше 100%")
    void testExcessiveDiscountValue() {
        assertThrows(ArithmeticException.class, () -> calculator.calculatingDiscount(100, 150));
    }
}
