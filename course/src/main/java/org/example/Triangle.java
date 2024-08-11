package org.example;

import lombok.Getter;

@Getter
public class Triangle implements Shape {
    private final int sideA;
    private final int sideB;

    public Triangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        if (sideA <= 0 || sideB <= 0) {
            throw new FigureInvalidException("Triangle's side should be bigger than zero", new IllegalArgumentException());
        }
    }

    @Override
    public double square() {
        return (double) (sideA * sideB) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with side_a " + sideA +
                " and side_b=" + sideB;
    }
}
