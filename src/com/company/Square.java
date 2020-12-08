package com.company;

import java.util.Scanner;

public class Square extends Shape {
    private double side;

    @Override
    public void inputParameters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input side of Square:");
        side = scan.nextDouble();
    }

    @Override
    public double getArea() {
        return this.side* this.side;
    }

    @Override
    public String getName(){
        return "Square";
    }
}