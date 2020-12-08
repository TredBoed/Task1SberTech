package com.company;
import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;

    @Override
    public void inputParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input base of triangle:");
        base = scan.nextDouble();
        System.out.println("Input height of triangle:");
        height = scan.nextDouble();
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public String getName(){
        return "Triangle";
    }
}