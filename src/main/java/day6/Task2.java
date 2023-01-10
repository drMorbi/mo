package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Cessna", 1999, 528, 767);
        airplane.setYear(2001);
        airplane.setLength(828);

        airplane.fillUp(143);
        airplane.fillUp(201);

        airplane.info();

    }
}
