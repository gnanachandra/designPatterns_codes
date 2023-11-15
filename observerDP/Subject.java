import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    private int value;

    public void setState(int value) {
        System.out.println("State Updated : New Value : "+value);
        this.value = value;
        notifyObservers();
    }

    public int getState() {
        return this.value;
    }

    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    public void notifyObservers() {
        System.out.println("Notifying observers");
        for (Observer ob : observers) {
            ob.update();
        }
    }
}