package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Ярослав", "Бесхвостые русалки");
        Teacher teacher = new Teacher("Василий Петрович", "Анатомия");

        System.out.println(student.getGroupName() + '\n' + teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}
