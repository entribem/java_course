package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Square implements Shape {
    private final int width;

    public Square(int width) {
        this.width = width;
        if (width <= 0) {
            throw new FigureInvalidException("Square's side should be bigger than zero", new IllegalArgumentException());
        }
    }

    @Override
    public double square() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Square with width " + width;
    }
}
