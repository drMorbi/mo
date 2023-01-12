package day7;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + '\n' +
                "Год выпуска: " + year + '\n' +
                "Длина: " + length + '\n' +
                "Вес: " + weight + '\n' +
                "Количество топлива в баке: " + fuel);
    }

    public int fillUp(int n){
        fuel += n;
        return fuel;
    }

    public static void compareAirplanes(Airplane plane, Airplane plane1){
        if (plane.getLength() > plane1.getLength()){
            System.out.println("Самолёт " + plane.manufacturer + " длиннее");
        } else if (plane.getLength() < plane1.getLength()) {
            System.out.println("Самолёт " + plane1.manufacturer + " длиннее");
        }else {
            System.out.println("Длины самолётов равны.");
        }
        System.out.println();
    }




}
