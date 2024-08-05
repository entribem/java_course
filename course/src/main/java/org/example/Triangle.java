package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Triangle implements Shape {
    private final int a;
    private final int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int square() {
        return (a * b) / 2;
    }
}
