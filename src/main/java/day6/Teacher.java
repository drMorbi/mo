package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    private Random rand = new Random();

    public void evaluate(Student student){
        int max = 5, min = 2;
        int estimation = rand.nextInt(max - min + 1) + min;
        String est = null;
        switch (estimation){
            case 2:
                est = "неудовлетворительно";
                break;
            case 3:
                est = "удовлетворительно";
                break;
            case 4:
                est = "хорошо";
                break;
            case 5:
                est = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + est);

    }
}
