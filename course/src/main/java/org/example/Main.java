package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 20);
        System.out.println("Hello world!");
        Creator creator = new Creator();
        List<Shape> shapes = creator.create(10);
        System.out.println(shapes);
    }
}