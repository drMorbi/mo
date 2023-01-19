package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message>messages = new ArrayList<>();


    public static void addNewMessage(User send, User reciv, String text){
        messages.add(new Message(send, reciv, text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message mess : messages){
            if (mess.getSender() == u1 && mess.getReceiver() == u2 ||
            mess.getSender() == u2 && mess.getReceiver() == u1) {
                System.out.println(mess.getSender() + ": " + mess.getText());
            }
        }
    }
}
