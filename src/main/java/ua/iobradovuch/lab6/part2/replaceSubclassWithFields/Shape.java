package ua.iobradovuch.lab6.part2.replaceSubclassWithFields;

public class Shape {
    private double area;
    private double perimeter;

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}