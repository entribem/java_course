package org.example;

import java.util.Random;

/**
 * ShapeFactory creates different Shape objects with random values
 */

public class ShapeFactory {
    private static final Random rand = new Random();
    private static final int lowerBound = 1;
    private static final int upperBound = 10;

    public Rectangle createRectangle() {
        return new Rectangle(rand.nextInt(lowerBound, upperBound), rand.nextInt(lowerBound, upperBound));
    }

    public Square createSquare() {
        return new Square(rand.nextInt(lowerBound, upperBound));
    }

    public Triangle createTriangle() {
        return new Triangle(rand.nextInt(lowerBound, upperBound), rand.nextInt(lowerBound, upperBound));
    }

    public Circle createCircle() {
        return new Circle(rand.nextInt(lowerBound, upperBound));
    }
}
