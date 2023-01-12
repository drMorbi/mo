package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Cessna", 1993, 543, 450);
        Airplane airplane1 = new Airplane("Sukhoi", 2010, 1356, 10000);

        Airplane.compareAirplanes(airplane1, airplane);

    }
}