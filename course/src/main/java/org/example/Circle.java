package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Circle implements Shape {
    private final double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int square() {
        return (int) Math.floor(Math.PI * radius * radius);
    }
}
