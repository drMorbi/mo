package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String>people = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String nameAge = scan.nextLine();
                people.add(nameAge);

                String[] humans = nameAge.split(" ");

                if (Integer.parseInt(humans[1]) < 0)
                    throw new IOException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }

        return people;
    }
}
