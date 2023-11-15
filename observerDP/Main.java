public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        subject.addObserver(binaryObserver);
        subject.addObserver(octalObserver);

        subject.setState(10);
        subject.setState(20);
    }
}
