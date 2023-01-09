package day5;

public class Motorbike {

    private String model;
    private String color;
    private int yearRelease;

    public Motorbike(String model, String color, int yearRelease){
        this.model = model;
        this.color = color;
        this.yearRelease = yearRelease;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearRelease() {
        return yearRelease;
    }
}
