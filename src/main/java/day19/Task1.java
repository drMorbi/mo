package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {

        File file = new File("E:\\zagruzki\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Map<String, Integer> words = new HashMap<>();
        List<String> word = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            scan.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scan.hasNext())
                word.add(scan.next());

            for (String val : word){
                if (words.containsKey(val))
                    words.put(val, words.get(val) + 1);
                else
                    words.put(val, 1);
            }


            for (Map.Entry<String, Integer> entry : words.entrySet()){
                if (entry.getKey().equals("Чичиков"))
                    System.out.println("\"Чичиков\" встречается " + entry.getValue() + " раз.");
            }

            for (int i = 0; i < 100; i++) {
                int maxValue = (Collections.max(words.values()));
                Iterator<Map.Entry<String, Integer>> iterator = words.entrySet().iterator();

                while (iterator.hasNext()){
                    Map.Entry<String, Integer> entry = iterator.next();
                    if (maxValue == entry.getValue()){
                        System.out.println(entry.getKey() + " "+ entry.getValue());
                        iterator.remove();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
