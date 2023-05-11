package org.example;

public class Main {
    public static void main(String[] args) {
        Geometric circle = new Circle(8.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        Geometric rectangle = new Rectangle(7.0,8.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}