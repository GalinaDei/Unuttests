package Seminar2.TaskTwo;

import java.util.regex.Pattern;

public class EmailValidator {
/* Напишите тесты с использованием аннотаций
    @Test,
    @Before,
    @After,
    @BeforeClass,
    @AfterClass
для проверки различных сценариев, включая правильные и неправильные адреса.*/
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public boolean isValidEmail(String email) {
        return pattern.matcher(email).matches();
    }
}
