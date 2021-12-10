package com.example.graphics;

public class Rectangular extends Shape {
    private double width, height;

    public Rectangular(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double computeArea() {
        return width * height;
    }

    @Override
    double computeCircumference() {
        return 2*width + 2*height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //just so that GraphicApp runs, should have put variables in other method
    @Override
    public char[] computeArea(double parseDouble, double parseDouble1) {
        return new char[0];
    }

    @Override
    public char[] computeCircumference(double width, double height) {
        return new char[0];
    }
}
