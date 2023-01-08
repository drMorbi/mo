package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matrix = new int[12][8];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(51);
            }
        }

        int maxSum =0;
        int idx = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                idx = i;
            }
        }
        System.out.println(idx);


    }
}
