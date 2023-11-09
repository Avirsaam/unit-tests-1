package Calculator;

public class Calculator {
    public double calculation(double firstOperand, double secondOperand, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public double add(int firstOperand, int secondOperand) {return calculation(firstOperand, secondOperand, '+');}
    public double divide(int firstOperand, int secondOperand) {return calculation(firstOperand, secondOperand, '/');}
    public double substract(int firstOperand, int secondOperand) {return calculation(firstOperand, secondOperand, '-');}
    public double multiply(int firstOperand, int secondOperand) {return calculation(firstOperand, secondOperand, '*');}


    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        //не вижу проблем в извлечении корня из 0 а также дробных значений корня
        return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount <= 0){
            throw new ArithmeticException();
        }
        if (discountAmount < 0 || discountAmount > 100){
            throw new ArithmeticException();
        }

        return purchaseAmount - purchaseAmount * discountAmount/100;
    }
}