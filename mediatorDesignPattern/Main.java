
public class Main {
    public static void main(String[] args) {
        User user1 = new User("User-1");
        User user2 = new User("User-2");
        user1.sendMessage("Hello user-2");
        user2.sendMessage("Hi user-1");
    }
}
