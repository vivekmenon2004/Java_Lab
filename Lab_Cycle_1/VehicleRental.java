class Vehicle {
    protected String regNo;
    protected double dailyRate;

    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    private int numDoors;

    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);       // Call parent constructor
        this.numDoors = numDoors;
