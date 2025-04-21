package com.PrincipleOops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        circle circle = new circle();
        Square square = new Square();

        shape.Area();
        circle.Area();
        square.Area();
    }
}
