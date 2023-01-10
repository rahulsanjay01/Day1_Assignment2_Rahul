package org.example.assignment2;

import java.util.Scanner;

public class Circle implements Shape{
    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        double radius =0;
        double area =0,pi=3.142;
        System.out.println("Please enter the radius of Circle : ");
        radius = scanner.nextDouble();
        area = pi * radius * radius;
        return area;
    }

    public void display(double area) {
        System.out.println("Circle area is : " + area);
    }
}
