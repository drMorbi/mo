package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        File file = new File("nums");

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной фаил");
        }

    }
    public static void printSumDigits(File file) throws FileNotFoundException, IllegalAccessException {
        Scanner scan = new Scanner(file);
        String str = scan.nextLine();
        String[] numStr = str.split(" ");

        if (numStr.length != 10)
            throw new IllegalAccessException();

        int sum = 0;

        for (String numbers: numStr){
            sum += Integer.parseInt(numbers);
        }

        System.out.println(sum);
        scan.close();
    }
}
