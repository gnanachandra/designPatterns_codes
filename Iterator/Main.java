public class Main {
    public static void main(String[] args) {
        NameAggregate na = new NameAggregate();
        Iterator it = na.getIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
