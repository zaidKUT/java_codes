package Coding;

interface Shape {
    double calculateArea();
}

abstract class AbstractShape implements Shape {
    protected double area;

    public AbstractShape() {
        initialize();
        calculateArea();
    }

    public abstract void initialize();

    public void displayDetails() {
        System.out.println("Shape Details:");
        System.out.println("Area: " + area);
    }
}

class Circle extends AbstractShape {
    private double radius;

    @Override
    public void initialize() {
        radius = 9.0; 
    }

    @Override
    public double calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    @Override
    public void initialize() {
        length = 5.0; 
        width = 5.0;  
    }

    @Override
    public double calculateArea() {
        area = length * width;
        return area;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.displayDetails();
        rectangle.displayDetails();
    }
}