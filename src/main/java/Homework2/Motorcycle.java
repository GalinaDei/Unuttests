package Homework2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String company, String model, int yearRelease, int numWheels, double speed) {
        super(company, model, yearRelease, numWheels, speed);
    }
    public Motorcycle(String company, String model, int yearRelease){
        super(company, model, yearRelease, 2, 0);
    }

    @Override
    void testDrive() {
        this.speed = 75;
    }

    @Override
    double park() {
        this.speed = 0;
        return speed;
    }
}
