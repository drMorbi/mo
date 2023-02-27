package SeaBattle;

import java.util.Scanner;

public class Player {
    private final String name;
    private final String[][] playerShips;
    private final String[][] playerBattle;
    private String space = "⬜";
    private boolean destroy;
    public int health;
    int x;
    int y;

    public String[][] getPlayerShips() {
        return playerShips;
    }

    public Player(String name) {
        this.name = name;
        health = 20;
        playerShips = new String[10][10];
        for (int i = 0; i < playerShips.length; i++) {
            for (int j = 0; j < playerShips.length; j++) {
                playerShips[i][j] = space;
            }
        }
        playerBattle = new String[10][10];
        for (int i = 0; i < playerBattle.length; i++) {
            for (int j = 0; j < playerBattle.length; j++) {
                playerBattle[i][j] = "\uD83D\uDDC6";
            }

        }
    }

    public String getName() {
        return name;
    }

    public boolean attack(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи координаты выстрела: ");

        String[] s = scan.nextLine().split(";");
        for (String sc : s) {
            String[] coord = sc.split(",");

            x = Integer.parseInt(coord[0]);
            y = Integer.parseInt(coord[1]);
        }

        if (player.getPlayerShips()[x][y].equals("\uD83D\uDEA2")) {
            System.out.println("Есть попадание!");
            player.getPlayerShips()[x][y] = "\uD83D\uDD34";
            checkDestroy(player.getPlayerShips(), x, y);
            playerBattle[x][y] = "\uD83D\uDD25";

            printBattle();

            player.health--;

            if (player.health == 0)
                System.out.println("Победа " + name);
            return true;
        } else {
            System.out.println("Мимо!");
            playerBattle[x][y] = "\uD83C\uDF0A";

            printBattle();
        }
        return false;

    }

    private void checkDestroy(String[][] playerShips, int x, int y) {
        int minX = Math.max(0, x - 1);
        int minY = Math.max(0, y - 1);
        int maxX = Math.min(9, x + 1);
        int maxY = Math.min(9, y + 1);

        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                destroy = !playerShips[i][j].equals("\uD83D\uDEA2");
            }
        }
        if (destroy) {
            System.out.println("Потопил");
        } else System.out.println("Ранил");
    }


    public void printField() {
        for (String[] playerShip : playerShips) {
            for (int j = 0; j < playerShips.length; j++)
                System.out.print(playerShip[j] + " ");

            System.out.println();
        }
    }

    public void printBattle() {
        for (String[] strings : playerBattle) {
            for (int j = 0; j < playerBattle.length; j++)
                System.out.print(strings[j] + " ");

            System.out.println();
        }
    }
}
