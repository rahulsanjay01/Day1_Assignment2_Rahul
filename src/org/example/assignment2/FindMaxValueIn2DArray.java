package org.example.assignment2;

import java.util.Arrays;
import java.util.Random;

public class FindMaxValueIn2DArray {

    public static void main(String args[]){
        int rows =3;
        int columns =3;
        int[][] array = new int[rows][columns];
        int maxValue = 0;
        Random random = new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j] = random.nextInt(100);
            }
        }
        for (int[] row : array){
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }

        System.out.println("Maximum value is : "+maxValue);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == maxValue) {
                    System.out.println("The Maximum value position is : ["+i+"]["+j+"]");
                }
            }
        }
    }
}
