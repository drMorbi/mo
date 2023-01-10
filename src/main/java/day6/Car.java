package day6;

public class Car {

    private String model;
    private String color;
    private int yearRelease;

    public void setModel(String modelCar) {
        model = modelCar;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String colorCar) {
        color = colorCar;
    }
    public String getColor() {
        return color;
    }

    public void setYearRelease(int yearReleaseCar) {
        yearRelease = yearReleaseCar;
    }
    public int getYearRelease() {
        return yearRelease;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        int diff = inputYear - yearRelease;
        return diff;
    }



}
