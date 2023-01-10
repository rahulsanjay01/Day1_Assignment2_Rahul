package org.example.assignment2;

public class AreaCalculation {
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        double rectangleArea = rectangle.calculateArea();
        rectangle.display(rectangleArea);

        Triangle triangle = new Triangle();
        double triangleArea = triangle.calculateArea();
        triangle.display(triangleArea);

        Circle circle = new Circle();
        double circleArea = circle.calculateArea();
        circle.display(circleArea);
    }
}
