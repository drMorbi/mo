package day12;


import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();

        fillingList(0, 30, listInt);
        fillingList(300, 350, listInt);
        System.out.println(listInt);
    }
    public static List<Integer> fillingList(int from, int to, List<Integer> listInt){
        for (int i = from; i < to; i++) {
            if (i % 2 ==0)
                listInt.add(i);
        }return listInt;
    }
}
