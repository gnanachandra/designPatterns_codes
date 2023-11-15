public class BridgeDemo {
    public static void main(String[] args) {
        Shape c1 = new Circle(10, 4, 5, new RedCircle());
        Shape c2 = new Circle(20, 10, 20, new GreenCircle());
        c1.draw();
        c2.draw();
    }
}
