package SeaBattle;

import java.util.Random;


public class Test {
    public static void main(String[] args) {
        Player player1 = new Player("Илья");
        Player player2 = new Player("Федя");
        Ship ship = new Ship();

        playGame(ship, player1, player2);
    }

    public static void playGame(Ship ship, Player player1, Player player2) {
        System.out.println("Первому игроку приготовиться! Второму отвернуться.");
        ship.setShip2(player1.getPlayerShips());
        System.out.println("Второму игроку приготовиться! Первому отвернуться.");
        ship.setShip2(player2.getPlayerShips());
        System.out.println("\nБОЙ НАЧИНАЕТСЯ!!!\n");

        Player[] currentPl = {player1, player2};

        Random random = new Random();
        int x = random.nextInt(2);

        Player currentPlayer = currentPl[x];
        System.out.print("Право первого выстрела достаётся ");
        if (x == 0) {
            System.out.println("первому игроку!");
        } else System.out.println("второму игроку!");

        while (player1.health != 0 && player2.health != 0) {
            if (currentPlayer == player1) {
                player1.attack(player2);
                if (!player1.attack(player2)) {
                    currentPlayer = player2;
                    System.out.println("Выстрел второго игрока!");
                }
            }

            if (currentPlayer == player2) {
                player2.attack(player1);
                if (!player2.attack(player1)) {
                    currentPlayer = player1;
                    System.out.println("Выстрел первого игрока!");
                }
            }
        }
        System.out.println("Конец игры!");
    }
}
