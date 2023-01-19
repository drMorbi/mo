package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<User> subscription;

    public User(String userName) {
        this.userName = userName;
        this.subscription = new ArrayList<>();

    }

    public String getUserName() {
        return userName;
    }
    public List<User> getSubscriptions() {
        return subscription;
    }

    public void subscribe(User user){
        subscription.add(user);
    }

    public boolean isSubscribed(User user){
        for (User x: subscription){
            if (x.getUserName().equals(user.getUserName()))
             return true;
        }
        return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return userName;
    }
}
