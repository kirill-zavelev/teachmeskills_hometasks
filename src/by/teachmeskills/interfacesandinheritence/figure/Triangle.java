package by.teachmeskills.interfacesandinheritence.figure;

import java.util.Objects;

public class Triangle extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private static final double PERIMETER_COEFFICIENT = 2;
    private final int base;
    private final int height;
    private final int radius;

    public Triangle(int base, int height, int radius) {
        this.base = base;
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return AREA_COEFFICIENT * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return (PERIMETER_COEFFICIENT * calculateArea()) / radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return base == triangle.base && height == triangle.height
                && radius == triangle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, radius);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "triangleBase=" + base +
                ", triangleHeight=" + height +
                ", radius=" + radius +
                '}';
    }
}
