public class ShapeFactory {
    private Shape circle;
    private Shape square;

    public ShapeFactory() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
