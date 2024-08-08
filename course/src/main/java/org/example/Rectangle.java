package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new FigureInvalidException("Rectangle's side should be bigger than zero", new IllegalArgumentException());
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width +
                " and height " + height;
    }
}
