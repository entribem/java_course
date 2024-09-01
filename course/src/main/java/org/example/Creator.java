package org.example;


import static java.lang.Math.ceil;

/**
 * Creator class is used to generate a fixed amount of random Shape objects
 */

public class Creator {
    ShapeFactory shapeFactory = new ShapeFactory();
    public CircularLinkedList<Shape> create(int shapeAmount) {
        int shapeTypeAmount = 4;
        int iterationsAmount = (int) Math.ceil((double) shapeAmount / shapeTypeAmount);
        Shape newShape;
        CircularLinkedList<Shape> shapeList = new CircularLinkedList<>();
        while (iterationsAmount > 0) {
            for (int i = 1; i <= shapeTypeAmount; ++i) {
                newShape = switch (i) {
                    case 1 -> shapeFactory.createCircle();
                    case 2 -> shapeFactory.createSquare();
                    case 3 -> shapeFactory.createRectangle();
                    default -> shapeFactory.createTriangle();
                };
                shapeList.addLast(newShape);
                if (shapeAmount-- < 0) {
                    break;
                }
            }
            iterationsAmount--;
        }
        return shapeList;
    }
}
