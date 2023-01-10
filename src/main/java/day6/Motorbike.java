package day6;

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

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        int diff = inputYear - yearRelease;
        if (diff < 0){
            diff = diff * -1;
        }
        return diff;
    }
}
