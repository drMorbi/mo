package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Motorbike motorbike = new Motorbike("Yava", "красный", 1987);

        int x = motorbike.yearDifference(scan.nextInt());
        motorbike.info();
        System.out.println("Возраст - " + x);


    }
}
