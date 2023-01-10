package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Лев Бухонский", "философия");
        Student student= new Student("Вовка");

        teacher.evaluate(student);

    }
}
