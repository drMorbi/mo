package day16;

import day15.EmptyFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("nums");
        printResult(file);

    }

    public static void printResult(File file){

        try {
            Scanner scan = new Scanner(file);
            if (!scan.hasNextLine())
                throw new EmptyFileException("Файл пуст");

            String[]num = scan.nextLine().split(" ");

            int sum= 0;
            for (String str: num)
                sum += Integer.parseInt(str);

            double average = (double)sum/num.length;
            System.out.printf(average + " --> " + "%.3f", average);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
    }
}

