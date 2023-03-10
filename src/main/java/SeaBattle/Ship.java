package SeaBattle;


import java.util.*;

public class Ship {

    private int x;
    private int y;
    private boolean position;
    private final String design;
    private String[] s;
    private int currentDeck;

    private LinkedHashMap<Integer, Integer> shipType1 = new LinkedHashMap<>();
    private List<Integer> xM = new ArrayList<>();
    private List<Integer> yM = new ArrayList<>();

    public Ship() {
        x = 0;
        y = 0;
        position = false;
        design = "\uD83D\uDEA2";
    }

    @Override
    public String toString() {
        return design;
    }


    private boolean checkCoordEnter(String[][] playerShips) {

        int minX;
        int minY;
        int maxX;
        int maxY;

        for (String sc : s) {
            String[] coord = sc.split(",");
            x = Integer.parseInt(coord[0]);
            y = Integer.parseInt(coord[1]);
            xM.add(x);
            yM.add(y);


            minX = Math.max(0, x);
            minY = Math.max(0, y);
            maxX = Math.min(9, x);
            maxY = Math.min(9, y);

            for (int i = minX; i <= maxX; i++) {
                for (int j = minY; j <= maxY; j++) {
                    if (playerShips[i][j].equals("\uD83D\uDD39") || playerShips[i][j].equals(design)) {
                        System.out.println("Место занято! Введи другие координаты.");
                        xM.clear();
                        yM.clear();
                        return false;
                    }
                }
            }
        }


        if (x < 0 || y < 0 || x > 9 || y > 9) {
            System.out.println("Неверные координаты! Диапазон от 0 до 9!");
            return false;
        }

        for (int i = 0; i < xM.size() - 1; i++) {
            if (xM.get(i + 1) - xM.get(i) != 1 && !Objects.equals(xM.get(i + 1), xM.get(i))) {
                System.out.println("Координаты должны идти последовательно");
                xM.clear();
                yM.clear();
                return false;
            }
        }
        for (int i = 0; i < yM.size() - 1; i++) {
            if (yM.get(i + 1) - yM.get(i) != 1 && !Objects.equals(yM.get(i + 1), yM.get(i))) {
                System.out.println("Координаты должны идти последовательно");
                xM.clear();
                yM.clear();
                return false;
            }
        }

        if (!valuesAscendEqual(yM) && !valuesEqualAscend(xM)) {

            System.out.println("Только не диагональ!");
            xM.clear();
            yM.clear();
            return false;
        }

        return true;
    }

    private boolean valuesEqualAscend(List<Integer> xM) {
        for (int i = 0; i < xM.size() - 1; i++) {
            if (xM.get(i + 1) - xM.get(i) == 1)
                return false;
        }
        return true;
    }

    private boolean valuesAscendEqual(List<Integer> yM) {
        for (int i = 0; i < yM.size() - 1; i++) {
            if (yM.get(i + 1) - yM.get(i) == 1)
                return false;
        }
        return true;
    }

    private void placementShips(String[][] ships) {

        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            s = scan.nextLine().split(";");

            if (s.length != currentDeck) {
                System.out.println("Колическтво палуб введено неверно!");
                continue;
            }

            valid = checkCoordEnter(ships);
            if (!valid)
                continue;

            for (String sc : s) {
                String[] coord = sc.split(",");

                x = Integer.parseInt(coord[0]);
                y = Integer.parseInt(coord[1]);

                ships[x][y] = design;
            }

            haloSecurity(ships, xM, yM);
            xM.clear();
            yM.clear();
        }
    }

    private void haloSecurity(String[][] playerShips, List<Integer> x, List<Integer> y) {

        int minX = Math.max(0, x.get(0) - 1);
        int minY = Math.max(0, y.get(0) - 1);
        int maxX = Math.min(9, x.get(x.size() - 1) + 1);
        int maxY = Math.min(9, y.get(y.size() - 1) + 1);

        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                if (playerShips[i][j].equals("⬜")) {
                    playerShips[i][j] = "\uD83D\uDD39";
                }
            }
        }
    }

    public void setShip2(String[][] ships) {
        shipType1.put(1, 4);
        shipType1.put(2, 3);
        shipType1.put(3, 2);
        shipType1.put(4, 1);

        for (Map.Entry<Integer, Integer> entry : shipType1.entrySet()) {
            System.out.print("Размещаем " + entry.getKey() + " палубный корабль. ");
            switch (entry.getKey()) {
                case 1:
                    currentDeck = entry.getKey();
                    System.out.println("Формат: x1,y1");
                    break;
                case 2:
                    currentDeck = entry.getKey();
                    System.out.println("Формат: x1,y1;x2,y2");
                    break;
                case 3:
                    currentDeck = entry.getKey();
                    System.out.println("Формат: x1,y1;x2,y2;x3,y3");
                    break;
                case 4:
                    currentDeck = entry.getKey();
                    System.out.println("Формат: x1,y1;x2,y2;x3,y3;x4,y4");
                    break;
            }

            for (int k = 0; k < entry.getValue(); k++) {
                if (entry.getValue() - k == 1) {
                    System.out.println("Остался " + (entry.getValue() - k) + " корабль");
                    printField(ships);
                }
                if (entry.getValue() - k != 1) {
                    System.out.println("Осталось " + (entry.getValue() - k) + " корабля");
                    printField(ships);
                }


                placementShips(ships);

            }
        }
    }

    private void printField(String[][] playerShips) {
        for (String[] playerShip : playerShips) {
            for (int j = 0; j < playerShips.length; j++)
                System.out.print(playerShip[j] + " ");

            System.out.println();
        }
    }
}
