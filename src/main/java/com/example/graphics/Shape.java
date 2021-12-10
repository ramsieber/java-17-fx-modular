package com.example.graphics;

abstract class Shape {
    private double x,y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double computeArea();
    abstract double computeCircumference();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    //just so that GraphicApp runs, should have put variables in other method
    public abstract char[] computeArea(double parseDouble, double parseDouble1);
    public abstract char[] computeCircumference(double parseDouble, double parseDouble1);
}
