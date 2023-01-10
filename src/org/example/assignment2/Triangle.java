package org.example.assignment2;

import java.util.Scanner;

public class Triangle implements Shape{
    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        double base =0;
        double height =0;
        System.out.println("Please enter the base of Triangle : ");
        base = scanner.nextDouble();
        System.out.println("Please enter the height of Triangle : ");
        height = scanner.nextDouble();
        double area = (base*height)/2;
        return area;
    }

    public void display(double area) {
        System.out.println("Triangle area is : "+ area);
    }
}
