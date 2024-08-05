package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Rectangle's side can not have negative value");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public int square() {
        return width * height;
    }
}
