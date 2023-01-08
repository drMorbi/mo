package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        int sum = 0;
        int num8 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (int workArr : arr) {
            System.out.print(workArr + " ");
            sum = sum + workArr;
            if (workArr > 8)
                num8++;
            if (workArr == 1)
                num1++;
            if (workArr % 2 == 0)
                num2++;
            if (workArr % 2 != 0)
                num3++;
        }

        System.out.println('\n' + "Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + num8);
        System.out.println("Количество чисел равных 1: " + num1);
        System.out.println("Количество чётных чисел: " + num2);
        System.out.println("Количество нечётных чисел: " + num3);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
