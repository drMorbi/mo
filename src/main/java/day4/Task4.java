package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10000);

        int maxSum = 0;
        int idx = 0;
        for (int i = 0; i < arr.length-2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if (sum > maxSum){
                maxSum = sum;
                idx = i;
            }

        }
        System.out.println(maxSum + " " + idx);
    }
}
