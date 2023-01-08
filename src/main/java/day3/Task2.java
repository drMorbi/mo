package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true){
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if (y == 0){
                break;
            }
            System.out.println(x / y);
        }



    }
}
