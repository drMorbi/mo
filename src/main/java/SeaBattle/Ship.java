package SeaBattle;


import java.util.Scanner;

public class Ship {
    private int number;
    private int coordX;
    private int coordY;
    private int decks;
    private boolean position;
    private String design;

    public Ship(int decks, int number) {
        this.number = number;
        this.decks = decks;
        coordX = 0;
        coordY = 0;
        position = true;
        design = "\uD83D\uDEA2";
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    public boolean isPosition() {
        return position;
    }

    public void setPosition(boolean position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return design;
    }

    public void setShip(String[][] ships) {
        Ship ship1 = new Ship(1, 4);
        Ship ship2 = new Ship(2, 3);
        Ship ship3 = new Ship(3, 2);
        Ship ship4 = new Ship(4, 1);
        Ship[] shipType = {ship1, ship2, ship3, ship4};

        Scanner scan = new Scanner(System.in);


        for (Ship ship : shipType) {
            System.out.println("Размещаем " + ship.decks + " палубный корабль");
            System.out.println("Размести корабль: х у положение (true - горизонтально, false - вертикально");

            for (int k = 0; k < ship.number; k++) {
                System.out.println("Осталось " + (ship.number - k) + " кораблей");

                int validate;
                do{
                coordX = scan.nextInt();
                coordY = scan.nextInt();
                position = scan.nextBoolean();

                validate = checkPlace(ships, coordX, coordY, position, decks);
                if (validate != 0)
                    System.out.println("Неверное расположение");
                }while (validate != 0);

                if (!position) {
                    for (int x = 0; x < ship.decks; x++) {
                        ships[coordX + x][coordY] = design;
                    }
                } else {
                    for (int x = 0; x < ship.decks; x++) {
                        ships[coordX][coordY + x] = design;
                    }
                }
            }
        }
    }


    private int checkPlace(String[][] playerShips, int coordX, int coordY, boolean position, int decks) {
        if (coordX < 0 || coordY < 0 || coordX >= 10 || coordY >= 10) return 1;
        if (position && coordY + decks >= 10) return 1;
        if (!position && coordX + decks >= 10) return 1;

        int minX = Math.max(0, coordX - 1);
        int minY = Math.max(0, coordY - 1);
        int maxX = Math.min(10 - 1, coordX + 1 + (!position ? decks : 0));
        int maxY = Math.min(10 - 1, coordY + 1 + (position ? 0 : decks));

        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                if (playerShips[x][y].equals("\uD83D\uDEA2")) return 1;
            }
        }
        return 0;
    }
}
