package com.company;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public void inputParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input width of Rectangle:");
        width = scan.nextDouble();
        System.out.println("Input height of Rectangle:");
        height = scan.nextDouble();
    }

    @Override
    public double getArea() {
        return this.width* this.height;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }
}