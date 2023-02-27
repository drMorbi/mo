package SeaBattle;


import java.util.*;

public class Ship {

    private int x;
    private int y;
    private boolean position;
    private final String design;
    private String[] s;
    private int currentDeck;

    LinkedHashMap<Integer, Integer> shipType1 = new LinkedHashMap<>();
    List<Integer> xM = new ArrayList<>();
    List<Integer> yM = new ArrayList<>();

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


    private boolean checkCoordEnter(int x, int y) {

        for (String sc : s) {
            String[] coord = sc.split(",");
            x = Integer.parseInt(coord[0]);
            y = Integer.parseInt(coord[1]);
            xM.add(x);
            yM.add(y);
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

            if (s.length == currentDeck && checkCoordEnter(x, y)) {
                for (String sc : s) {
                    String[] coord = sc.split(",");

                    x = Integer.parseInt(coord[0]);
                    y = Integer.parseInt(coord[1]);

                    valid = checkShip(ships, x, y);
                    if (!valid)
                        continue;

                    ships[x][y] = design;
                }
                if (s.length != currentDeck) {
                    System.out.println("Колическтво палуб введено неверно!");
                    continue;
                }
            }

            if (valid) {

                positionShip(xM, yM);
                haloSecurity(ships, xM, yM, position);
                xM.clear();
                yM.clear();
            }
        }
    }

    private void positionShip(List<Integer> list1, List<Integer> list2) {

        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i + 1) - list1.get(i) == 1) {
                position = true;
                break;
            }
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            if (list2.get(i + 1) - list2.get(i) == 1) {
                position = false;
                break;
            }
        }
    }

    private boolean checkShip(String[][] playerShips, int x, int y) {
        int minX = Math.max(0, x);
        int minY = Math.max(0, y);
        int maxX = Math.min(9, x);
        int maxY = Math.min(9, y);

        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                if (playerShips[i][j].equals("\uD83D\uDD39")) {
                    System.out.println("Корабли не могут касаться друг друга!");
                    return false;
                }
            }
        }
        return true;
    }

    private void haloSecurity(String[][] playerShips, List<Integer> x, List<Integer> y, boolean position) {

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
                if (entry.getValue() - k == 1)
                    System.out.println("Остался " + (entry.getValue() - k) + " корабль");
                if (entry.getValue() - k != 1) {
                    System.out.println("Осталось " + (entry.getValue() - k) + " корабля");
                }


                placementShips(ships);

            }
        }
    }
}
