package Homework2;
public abstract class Vehicle {
    /*"testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".*/
    String company;
    String model;
    int yearRelease;
    int numWheels;
    double speed;
   abstract void testDrive();
    abstract double park();

    public Vehicle(String company, String model, int yearRelease, int numWheels, double speed) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;
        this.speed = speed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public double getSpeed() {
        return speed;
    }
}
