package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\zagruzki\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        Map<Integer, Point> taxi = new HashMap<>();
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            String[] strTaxi = str.split(" ");
            taxi.put(Integer.parseInt(strTaxi[0]), new Point(Integer.parseInt(strTaxi[1]), Integer.parseInt(strTaxi[2])));
        }

        scan.close();

        Scanner scanUser = new Scanner(System.in);
        System.out.println("Введи координаты x1;y1");
        int x1 = scanUser.nextInt(), y1 = scanUser.nextInt();
        Point point1 = new Point(x1, y1);
        System.out.println("Введи координаты x2;y2");
        int x2 = scanUser.nextInt(), y2 = scanUser.nextInt();
        Point point2 = new Point(x2, y2);

        int volume = 0;

        for (Map.Entry<Integer, Point> search : taxi.entrySet()) {
            if (search.getValue().getX() > point1.getX() && search.getValue().getY() > point1.getY() &&
                    search.getValue().getX() < point2.getX() && search.getValue().getY() < point2.getY()) {
                volume++;
                System.out.println(search.getKey());
            }
        }
        System.out.println(volume);
    }
}
