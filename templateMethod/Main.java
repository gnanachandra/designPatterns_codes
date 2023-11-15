// Abstract class defining the template method
abstract class Beverage {

    // Template method containing the algorithm's structure
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common methods used by all beverages
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();

    protected abstract void addCondiments();
}

// Concrete subclass representing Tea
class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}

// Concrete subclass representing Coffee
class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Preparing tea...");
        tea.prepareBeverage();

        System.out.println("\n-------------------\n");

        Beverage coffee = new Coffee();
        System.out.println("Preparing coffee...");
        coffee.prepareBeverage();
    }
}
