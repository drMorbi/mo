package SeaBattle;

import java.util.Objects;
import java.util.Scanner;

public class Player2 {
    private String name;
    private String[][] playerShips;
    int health;

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String[][] getPlayerShips() {
        return playerShips;
    }

    public Player2(String name) {
        this.name = name;
        health = 20;
        playerShips = new String[10][10];
        for (int i = 0; i < playerShips.length; i++) {
            for (int j = 0; j < playerShips.length; j++) {
                playerShips[i][j] = "⬜";
            }
        }
    }

    public String getName() {
        return name;
    }

    public void attack(Player player){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи координаты выстрела: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (Objects.equals(playerShips[x][y], "\uD83D\uDEA2")){
            System.out.println("Есть попадание!");
            playerShips[x][y] = "\uD83D\uDD34";
            player.health --;
            if (player.health == 0)
                System.out.println("Победа " + name);
        }else {
            System.out.println("Мимо!");
        }

    }

    public void printField() {
        for (int i = 0; i < playerShips.length; i++) {
            for (int j = 0; j < playerShips.length; j++)
                System.out.print(playerShips[i][j] + " ");

            System.out.println();
        }
    }
}
