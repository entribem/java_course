package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Creator class is used to generate a fixed amount of random Shape objects
 */

public class Creator {
    ShapeFactory shapeFactory = new ShapeFactory();
    public List<Shape> create(int amount) {
        Random myRand = new Random();
        int randomNum;
        Shape newShape;
        List<Shape> myList = new ArrayList<Shape>(amount);
        while (amount > 0) {
            randomNum = myRand.nextInt(1, 4);
            if (randomNum == 1) {
                newShape = shapeFactory.createRectangle();
            }
            else if (randomNum == 2) {
                newShape = shapeFactory.createSquare();
            }
            else if (randomNum == 3) {
                newShape = shapeFactory.createCircle();
            }
            else {
                newShape = shapeFactory.createTriangle();
            }
            myList.add(newShape);
            amount--;
        }
        return myList;
    }
}
