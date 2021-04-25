package com;

public class BlueShapeFactory implements ShapeFactory{
    @Override
    public Shape getCircle() {
        return new BlueCircle();
    }

    @Override
    public Shape getRectange() {
        return new BlueRectangle();
    }
}
