package com;

public class RedShapeFactory implements ShapeFactory{
    @Override
    public Shape getCircle() {
        return new RedCircle();
    }

    @Override
    public Shape getRectange() {
        return new RedRectangle();
    }
}
