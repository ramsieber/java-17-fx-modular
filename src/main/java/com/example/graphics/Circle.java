package com.example.graphics;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double computeCircumference() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    //just so that GraphicApp runs, should have put variables in other method
    @Override
    public char[] computeArea(double parseDouble, double parseDouble1) {
        return new char[0];
    }

    @Override
    public char[] computeCircumference(double parseDouble, double parseDouble1) {
        return new char[0];
    }
}
