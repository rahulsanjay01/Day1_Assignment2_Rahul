package org.example.assignment2;

import java.util.Scanner;

public class Rectangle implements Shape{

    public double calculateArea() {
        Scanner scanner = new Scanner(System.in);
        double width =0;
        double height =0;
        System.out.println("Please enter the width of Rectangle : ");
        width = scanner.nextDouble();
        System.out.println("Please enter the height of Rectangle : ");
        height = scanner.nextDouble();

        return (width*height);
    }

    public void display(double area) {
        System.out.println("Rectangle area is : " + area);
    }

}
