package day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("E:\\zagruzki\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");

        searchMissingShoes(file);

    }

    public static File searchMissingShoes(File file) {

        try {
            PrintWriter pw = new PrintWriter("E:\\zagruzki\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt", StandardCharsets.UTF_8);
            Scanner scan = new Scanner(file);
            if (!scan.hasNextLine())
                throw new EmptyFileException();

            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                String[] shoesStr = str.split(";");
                if (shoesStr.length != 3)
                    throw new IllegalAccessException();

                if (Integer.parseInt(shoesStr[2]) == 0)
                    pw.println(Arrays.toString(shoesStr));
            }pw.close();
            scan.close();

        } catch (IOException e) {
            System.out.println("Ошибка создания");
        } catch (IllegalAccessException e) {
            System.out.println("Фйл некорректен");
        } catch (EmptyFileException e) {
            System.out.println("Файл пуст");
        }
        return null;
    }
}
