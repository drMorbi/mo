package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        int zero = 0;
        int zeroSum = 0;

        for (int workArr : arr) {
            if (workArr > max)
                max = workArr;
            if (workArr < min)
                min = workArr;
            if (workArr % 10 == 0) {
                zero++;
                zeroSum = zeroSum + workArr;
            }
        }

        System.out.println("Наибольшый элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Сумма чисел с 0: " + zeroSum);
        System.out.println("Количество чисел с 0: " + zero);


    }
}
