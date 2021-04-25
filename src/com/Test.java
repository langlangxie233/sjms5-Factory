package com;

public class Test {
    public static void main(String[] args) {
        ShapeFactory redShapeFactory = new RedShapeFactory();
        Shape circle = redShapeFactory.getCircle();
        circle.draw();
        Shape rectangle = redShapeFactory.getRectange();
        rectangle.draw();
    }
}