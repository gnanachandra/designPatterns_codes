import java.util.HashMap;

// Flyweight interface
interface Shape {
    void draw(int x, int y);
}

// ConcreteFlyweight
class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing Circle: Color=" + color + ", x=" + x + ", y=" + y);
    }
}

// FlyweightFactory
class ShapeFactory {
    private final HashMap<String, Shape> circleMap = new HashMap<>();

    public Shape getCircle(String color) {
        if (circleMap.containsKey(color)) {
            return circleMap.get(color);
        } else {
            System.out.println("Creating new circle object of color :"+color);
            Shape circle = new Circle(color);
            circleMap.put(color, circle);
            return circle;
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Requesting and drawing circles
        Shape redCircle = shapeFactory.getCircle("red");
        redCircle.draw(100, 100);

        Shape blueCircle = shapeFactory.getCircle("blue");
        blueCircle.draw(200, 200);

        Shape redCircleAgain = shapeFactory.getCircle("red");
        redCircleAgain.draw(300, 300);
    }
}
