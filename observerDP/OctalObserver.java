public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
    }

    public void update() {
        System.out.println("Binary Value : " + Integer.toOctalString(subject.getState()));
    }
}
