package Homework2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    /**
     * - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     * - Проверить, что объект Car создается с 4-мя колесами.
     * - Проверить, что объект Motorcycle создается с 2-мя колесами.
     * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    Car car = new Car("LADA", "Granta", 2011);
    Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Softail Standard", 2022);

    @Test
    @DisplayName("Проверка, что экземпляр car наследует класс Vehicle")
    void instanceOf() {assertThat(car instanceof Vehicle);}
    @Test
    @DisplayName("Проверка, что у машины 4 колеса")
    void getCarNumWheels() {assertThat(car.getNumWheels()).isEqualTo(4);}
    @Test
    @DisplayName("Проверка, что у мотоцикла 2 колеса")
    void getMotoNumWheels() {assertThat(motorcycle.getNumWheels()).isEqualTo(2);}
    @Test
    @DisplayName("Проверка, что у машины скорость 60 в режиме тестдрайв")
    void testCarDriveTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60); }
    @Test
    @DisplayName("Проверка, что у мотоцикла скорость 75 в режиме тестдрайв")
    void testMotoDriveTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75); }
    @Test
    @DisplayName("Проверка, что у машины скорость 0 в режиме парковки")
    void testCarParkTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0); }
    @Test
    @DisplayName("Проверка, что у мотоцикла скорость 0 в режиме парковки")
    void testMotoParkTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0); }

}