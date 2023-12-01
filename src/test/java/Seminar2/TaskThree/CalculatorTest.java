package Seminar2.TaskThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();
    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})  // проверяются группы аргументов (а, в, результат суммирования)
    void testAdd(int a, int b, int expected) {                   // таких групп четыре
        int result = calc.add(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 2, -1", "0, 0, 0", "-1, 1, -2", "10, -5, 15"})
    void testSubtract(int a, int b, int expected) {
        int result = calc.subtract(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 2, 2", "0, 0, 0", "-1, 1, -1", "10, -5, -50"})
    void testMultiply(int a, int b, int expected) {
        int result = calc.multiply(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 2, 0.5", "0, 3, 0", "-1, 1, -1", "10, -5, -2"})
    void testDivide(int a, int b, double expected) {
        double result = calc.divide(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 0", "0, 3", "-1, 1", "10, 0"})
    void testDivideByZero(int a, int b) {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }

}