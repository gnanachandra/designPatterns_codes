// Subject interface
interface Image {
    void display();
}

// RealSubject
class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display() {
        System.out.println("Displaying RealImage: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading image from disk: " + fileName);
    }
}

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image loaded from disk only when requested
        image.display();
        image.display();
    }
}
