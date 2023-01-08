package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        if (x >= 5){
            double y = (Math.pow (x, 2) - 10)/(x + 7);
            System.out.println(y);
        } else if (x > -3 && x < 5) {
            double y = (x + 3)*(Math.pow (x, 2) - 2);
            System.out.println(y);
        }else {
            double y = 420;
            System.out.println(y);
        }

    }
}
