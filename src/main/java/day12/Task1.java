package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Volvo");
        list.add("Lada");
        list.add("Opel");
        list.add("Honda");


        list.add(2, "Suzuki");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
