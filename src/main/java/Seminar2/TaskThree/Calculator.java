package Seminar2.TaskThree;

public class Calculator {
    /*
    Используйте параметризованные тесты для проверки работы этих операций на различных входных данных и убедитесь,
    что результаты верны.
     */
    public int add(int a, int b) {return a + b;}
    public int subtract(int a, int b) {return a - b;}
    public int multiply(int a, int b) {return a * b;}
    public double divide(int a, int b) {
        if (b == 0) {throw new IllegalArgumentException("Divider cannot be zero");}
        return (double) a / b;
    }
}
