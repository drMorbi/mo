package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setModel("Volvo");
        car1.setColor("Красный");
        car1.setYearRelease(2007);

        System.out.println("Автомобиль - " + car1.getModel() + '\n' + "Цвет - " + car1.getColor() + '\n' + "Год выпуска - " + car1.getYearRelease());

    }
}
