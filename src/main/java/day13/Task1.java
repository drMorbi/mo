package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Вася");
        User user2 = new User("Оля");
        User user3 = new User("Анатолий");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Прекрасно!!");
        user2.sendMessage(user1, "Как сам?");

        user3.sendMessage(user1, "Я поел котлет.");
        user3.sendMessage(user1, "С пюрешкой!!");
        user3.sendMessage(user1, "Спасибо, очень вкусно.");

        user1.sendMessage(user3, "Сам приготовил.");
        user1.sendMessage(user3, "Вот ЭТОЙ рукой!!! Хехе.");
        user1.sendMessage(user3, "Кушай на здоровье!");

        user3.sendMessage(user1, "Шутник, однако...");


        MessageDatabase.showDialog(user1, user3);




    }
}
