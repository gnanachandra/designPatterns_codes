
public class ChatRoom implements ChatRoomInterface {
    private static ChatRoom chatRoom = new ChatRoom();

    public static ChatRoom createInstance() {
        return chatRoom;
    }

    public void showMessage(User user, String message) {
        System.out.println("User name " + user.getName() + " Message : " + message);
    }
}
