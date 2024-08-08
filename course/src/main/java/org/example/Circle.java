package org.example;

import lombok.Getter;

@Getter
public class Circle implements Shape {
    private final double radius;

    public Circle(int radius) {
        this.radius = radius;
        if (radius <= 0) {
            throw new FigureInvalidException("Circle's radius should be bigger than zero", new IllegalArgumentException());
        }
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
