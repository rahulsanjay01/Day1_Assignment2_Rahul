package org.example.assignment2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of values that you want to add : ");
        int noOfValues = scanner.nextInt();
        int sum=0;
        for(int i=1;i<=noOfValues;i++){
            System.out.println("Please enter number " + i + " : ");
            int input = scanner.nextInt();
            sum=sum+input;
        }

        System.out.println("Sum of entered values are : " + sum);
    }
}
