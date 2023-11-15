
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sendMessage(String message) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.showMessage(this, message);
    }
}
