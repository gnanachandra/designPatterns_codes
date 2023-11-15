public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("Show method ");
    }
}