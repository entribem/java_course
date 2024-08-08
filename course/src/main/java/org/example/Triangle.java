package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Triangle implements Shape {
    private final int side_a;
    private final int side_b;

    public Triangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
        if (side_a <= 0 || side_b <= 0) {
            throw new FigureInvalidException("Triangle's side should be bigger than zero", new IllegalArgumentException());
        }
    }

    @Override
    public double square() {
        return (double) (side_a * side_b) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with side_a " + side_a +
                " and side_b=" + side_b;
    }
}
