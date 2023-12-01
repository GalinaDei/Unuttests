package Seminar2.TaskOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*Напишите тесты с использованием ассертов assertEquals, assertTrue, assertFalse, assertNull, assertNotNull и
    проверьте работу методов на различных наборах данных.*/
class MathUtilsTest {
private MathUtils mu;
    @BeforeEach
    void setUp() {mu = new MathUtils();}
    @AfterEach
    void tearDown() {mu = null;}
    @Test    @DisplayName("Проверка суммирования")
    void add() {assertEquals(10, mu.add(7,3));}
    @Test
    @DisplayName("Проверка вычитания")
    void subtract() {assertEquals(7,mu.subtract(10,3));}
    @Test
    @DisplayName("Проверка умножения")
    void multiply() {assertEquals(10,mu.multiply(5,2));}
    @Test
    @DisplayName("Проверка деления")
    void divide() {assertEquals(5,mu.divide(10,2));}
    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(mu.add(2, 2) == 4);
    }
    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(mu.add(2, 2) == 5);
    }
    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(mu);
    }
    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        mu = null;
        assertNull(mu);
    }
}