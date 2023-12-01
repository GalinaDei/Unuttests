import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class TaskOneTest {
    @BeforeEach                  // перед каждым тестом, где хотим, чтобы этот метод был выполнен
    public void setup() {
// Инициализация ресурсов
    }
    @AfterEach                   // после каждого теста, где хотим, чтобы этот метод был выполнен
    public void teardown() {
// Очистка ресурсов
    }
    @BeforeAll
    public static void globalSetup() {
// Инициализация
    }
    @AfterAll
    public static void globalTeardown() {
// Очистка
    }
@Test
public void testMethod() {                      // Важно! Перед запуском закомментировать предыдущие тесты
    assertEquals(5, 2 + 3);
}
    @Test
    @DisplayName("Тест суммирования")           // Важно! Перед запуском закомментировать тесты Before и After
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
}
