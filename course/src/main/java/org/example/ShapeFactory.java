package org.example;

import java.util.Random;

public class ShapeFactory {
    private static final Random rand = new Random();
    private static final int bound = 10;

    Rectangle createRectangle() {
        return new Rectangle(rand.nextInt(1, bound), rand.nextInt(1, bound));
    }

    Square createSquare() {
        return new Square(rand.nextInt(1, bound));
    }

    Triangle createTriangle() {
        return new Triangle(rand.nextInt(1, bound), rand.nextInt(1, bound));
    }

    Circle createCircle() {
        return new Circle(rand.nextInt(1, bound));
    }
}
