//client
public class CompositeDemo {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John Doe");
        Employee developer2 = new Developer("Jane Smith");

        Manager manager = new Manager("Alice Johnson");
        manager.addSubordinate(developer1);
        manager.addSubordinate(developer2);

        manager.showDetails();
    }
}
