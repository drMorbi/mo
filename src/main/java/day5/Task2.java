package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike moto = new Motorbike("Yamaha", "green", 2013);
        System.out.println("Мотоцикл - " + moto.getModel());
        System.out.println("Цвет - " + moto.getColor());
        System.out.println("Год выпуска - " + moto.getYearRelease());

    }
}
