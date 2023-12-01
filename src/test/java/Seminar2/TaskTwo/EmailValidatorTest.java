package Seminar2.TaskTwo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    /* Напишите тесты с использованием аннотаций
    @Test,
    @Before,
    @After,
    @BeforeClass,
    @AfterClass
    для проверки различных сценариев, включая правильные и неправильные адреса.*/
    private  static EmailValidator ev;
             // BeforeClass и AfterClass аналогичны аннотациям и выполняются до и после всех тестовых методов.
             // Прежназначены для выполнения настроек и подготовительных действий перед запуском и после завершения тестов.
    @BeforeAll
    public static void setUp() {ev = new EmailValidator();}
    @AfterAll
    public static void tearDown() {ev = null;}
    @Test
    public void isValidEmail() {assertTrue(ev.isValidEmail("123True_5@mail.ru"));}
    @Test
    public void isNotValidEmail() {assertFalse(ev.isValidEmail("123True_5mail.ru"));}
}