package com.example.designpatterns;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Singleton Pattern =====");

        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Only one Singleton object exists.");
        }

        System.out.println();

        System.out.println("===== Factory Pattern =====");

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
    }
}