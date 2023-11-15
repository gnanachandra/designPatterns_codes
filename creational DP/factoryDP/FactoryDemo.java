public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape squareObj = sf.getShape("square");
        squareObj.draw();
        Shape rectangleObj = sf.getShape("rectangle");
        rectangleObj.draw();

    }
}
