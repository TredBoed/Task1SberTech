package com.company;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;
    private final double Pi = 3.14159265;

    @Override
    public void inputParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input radius of Shape:");
        radius = scan.nextDouble();
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Pi;
    }

    @Override
    public String getName(){
        return "Circle";
    }
}