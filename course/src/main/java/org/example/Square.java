package org.example;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Square implements Shape {
    private final int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int square() {
        return width * width;
    }
}
