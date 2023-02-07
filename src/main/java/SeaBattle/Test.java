package SeaBattle;

public class Test {
    public static void main(String[] args)  {
        Player player1 = new Player("Илья");
        Player2 player2 = new Player2("Федя");
        Ship ship = new Ship(0, 0);


        playGame(ship, player1, player2);
        player1.printField();
        
    }
    public static void playGame(Ship ship, Player player1, Player2 player2) {
        System.out.println("Первый игрок расставляет свои корабли!");
        ship.setShip(player1.getPlayerShips());

//        System.out.println("Второй игрок расставляет свои корабли!");
//        ship.setShip(player2.getPlayerShips());

    }
}
