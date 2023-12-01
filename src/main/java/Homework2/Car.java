package Homework2;

public class Car extends Vehicle{
    private Car(String company, String model, int yearRelease, int numWheels, double speed) {
        super(company, model, yearRelease, numWheels, speed);
    }
    public Car(String company, String model, int yearRelease){
        super( company,model,yearRelease,4,0);
    }

    @Override
    void testDrive() {
        this.speed = 60;
    }

    @Override
    double park() {
        this.speed = 0;
        return speed;
    }
}
