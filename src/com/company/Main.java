package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle", "TwoDimensionalShape", "Shape");
        Square square = new Square("Square", "TwoDimensionalShape", "Shape");
        Cube cube = new Cube("Cube", "ThreeDimensional", "Shape");
        Sphere sphere = new Sphere("ThreeDimensional", "Shape", "Sphere");


        System.out.println(circle);
        System.out.println("------------------------------------------");
        System.out.println(square);
        System.out.println("------------------------------------------");
        System.out.println(cube);
        System.out.println("------------------------------------------");
        System.out.println(sphere);


    }
}
