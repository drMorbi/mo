package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int max = 100, min = 90;
        int rand_num = rand.nextInt(max - min + 1) + min;

        Player player1 = new Player(rand_num);
        Player player2 = new Player(rand_num);
        Player player3 = new Player(rand_num);
        Player player4 = new Player(rand_num);
        Player player5 = new Player(rand_num);
        Player player6 = new Player(rand_num);
        Player player7 = new Player(rand_num);



        Player.info();
        System.out.println(Player.getCountPlayers());

        while (player1.getStamina() > 0){
            player1.run();
        }

        System.out.println(Player.getCountPlayers());





    }
}
