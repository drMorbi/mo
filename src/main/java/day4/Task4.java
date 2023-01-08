package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10000);

        int sum;
        int maxSum = 0;
        int idx = 0;
        for (int i = 1; i < arr.length-1; i++) {
            sum = arr[i] + arr[i-1] + arr[i+1];
            if (sum > maxSum) {
                maxSum = sum;
                idx = i - 1;
            }
        }
        System.out.println(maxSum + " " + idx);
    }
}
