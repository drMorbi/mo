package day9.Task2;

public class Triangle extends Figure {

    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p1 = perimeter()/2;
        return Math.sqrt(p1 * (p1-sideA)*(p1-sideB)*(p1-sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    
}
