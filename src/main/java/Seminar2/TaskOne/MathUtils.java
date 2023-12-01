package Seminar2.TaskOne;

public class MathUtils {
    /*Напишите тесты с использованием ассертов assertEquals, assertTrue, assertFalse, assertNull, assertNotNull и
    проверьте работу методов на различных наборах данных.*/
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
}

