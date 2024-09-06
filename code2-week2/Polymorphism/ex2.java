// File: Shapes.java
package com.mycompany.app;

class Shape {
    public void draw() {
        System.out.println("Drawing a Shape");
    }

    public void erase() {
        System.out.println("Erasing a Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

public class PolymorphismExercise2 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle() };
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
        }
    }
}