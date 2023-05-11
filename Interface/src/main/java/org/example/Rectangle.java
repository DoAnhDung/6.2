package org.example;

import org.example.Geometric;

public class Rectangle implements Geometric {
private double width, length;
public Rectangle(double width,double length){
    this.width=width;
    this.length=length;
}
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }
}

