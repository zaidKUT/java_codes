package Coding;

interface Engine {
    void start();
    void stop();
}

interface Features {
    void accelerate();
    void brake();
}

abstract class Vehicle {
    String brand;
    String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    abstract void displayInfo();
}

class Car extends Vehicle implements Engine, Features {
    public Car(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
    
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
    
    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }
    
    @Override
    void displayInfo() {
        System.out.println("Car make: " + brand);
        System.out.println("Car model: " + model);
    }
}

public class Wheel {
    public static void main(String[] args) {
        Car myCar = new Car("Tata", "Nexon");
        myCar.displayInfo();
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
        Car myCar1 = new Car("Maruti","Swift");
        System.out.println();
        myCar1.displayInfo();
    }
}
