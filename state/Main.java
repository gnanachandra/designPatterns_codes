interface State {
    public void doAction(Context context);
}

class StateA implements State {
    public void doAction(Context context) {
        System.out.println("State A Action");
        context.setState(new StateB());
    }

}

class StateB implements State {
    public void doAction(Context context) {
        System.out.println("State B Action");
        context.setState(new StateA());
    }
}

class Context {
    private State state;

    public Context() {
        this.state = new StateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.doAction(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.request();
        context.request();
        context.request();
    }
}
