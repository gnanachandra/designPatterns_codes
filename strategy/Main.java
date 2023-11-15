interface Strategy {
    public void doOperation(int num1,int num2);
}

class AddStrategy implements Strategy{
    public void doOperation(int num1,int num2)
    {
        System.out.println("Addition : "+(num1 + num2));
    }
}

class SubStrategy implements Strategy {
    public void doOperation(int num1,int num2)
    {
        System.out.println("Subtraction : "+(num1 - num2));
    }
}


class Context {
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void request(int num1,int num2)
    {
        strategy.doOperation(num1, num2);
    }
}

public class Main{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Context context = new Context(new AddStrategy());
        context.request(num1, num2);
        context.setStrategy(new SubStrategy());
        context.request(num1, num2);
    }
}