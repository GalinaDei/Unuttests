package Seminar1.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeAll
    static void beforeAll() {
// Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
// Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
    /**
     Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает
     сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает
     недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
     */
    @Test
    @DisplayName("Проверка расчета скидки")
    void testCalculateDiscount() {
        assertEquals(5.03, calculator.calculateDiscount(100.6, 5));
    }

    @Test
    @DisplayName("Проверка валидности аргументов при расчете скидки")
    void testNotNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateDiscount(-20, 5));
    }

    @Test
    @DisplayName("Проверка суммирования")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Disabled("Этот тест отключен")
    void disabledTest() {
        fail("Не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Параметризованный тест для умножения на 2")
    void testMultiplyWithParameters(int arg) {
        assertEquals(arg * 2, calculator.multiply(arg, 2));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }
    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
//    @BeforeAll
//    public static void initAll() {          // названия таких методов будут у всех плю-минус одинаковые
//// Здесь можно, например, подключиться к базе данных
//    }
//
//    @AfterAll
//    public static void tearDownAll() {     // названия таких методов будут у всех плю-минус одинаковые
//// Закрытие соединения с базой данных
//    }
//
//    @BeforeEach                        // Пример использования этого типа методов: перед каждым тестом создается
//    public void init() {               //  новый объект calculator.
//        calculator = new Calculator(); // Инициализация перед каждым тестом
//    }
//
//    @AfterEach                          // После отработки  теста объект обнуляется. Таким образом тесты не зависимы друг от друга
//    public void tearDown() {
//        calculator = null; // Очистка после каждого теста
//    }
//
//    @Test
//    @DisplayName("Проверка суммирования")    // Демонстрация действия переименования в понятное название
//    public void testAdd() {
//        assertEquals(5, calculator.add(2, 3));
//    }
//
//    @Test
//    @DisplayName("Проверка вычитания")
//    public void testSubtract() {
//        assertEquals(1, calculator.subtract(3, 2));
//    }
//
//    @Test
//    @Disabled                                   // Отключает тест
//    @DisplayName("Тест отключен")
//    public void testDisabled() {
//        fail("Этот тест не будет выполнен");     // метод выводит в логи сообщение, что тест выключен
//    }
//
//    @ParameterizedTest      // используется для тестирования больших вычислений: заранее объявляется список аргументов и
//    @ValueSource(ints = {0, 1, 5, 100})    // этот список подается в качестве аргумента в метод
//    @DisplayName("Параметризованный тест для суммирования") //  даже если с одним элементом списка аргументов будет ошибка, остальные все равно выполнятся.
//    public void parameterizedTest(int arg) {
//        assertEquals(arg + 2, calculator.add(arg, 2));
//    }
}