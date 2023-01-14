package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String num = "";

        for (int i = 0; i <= 20000; i++) {
            num += (i) + " ";
        }
        System.out.println(num);

        long stopTime = System.currentTimeMillis();


        long startTime1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы класс Sting, в мс.: " + (stopTime - startTime));
        System.out.println("Длительность работы класс StringBuilder, в мс.: " + (stopTime1 - startTime1));

    }
}
