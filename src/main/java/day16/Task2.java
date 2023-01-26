package day16;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);

        Random rand = new Random();

        for (int i = 0; i < 1000; i++)
            pw.println(rand.nextInt(100));

        pw.close();

        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        Scanner scan = new Scanner(file1);

        int sum = 0;
        int quantity = 0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            quantity++;

            if (quantity == 20) {
                pw2.println(sum / 20.0);

                sum = 0;
                quantity = 0;
            }
        }
        pw2.close();
        scan.close();

        printResult(file2);

    }

    public static void printResult(File file) {

        try {
            Scanner scan = new Scanner(file);
            double sum = 0;

            while (scan.hasNextLine()) {
                sum += Double.parseDouble(scan.nextLine());
            }
            scan.close();
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }

    }

}
