public class NameAggregate implements Aggregate {

    private String[] names = { "User-1", "user-2", "user-3" };

    public Iterator getIterator() {
        NameIterator iterator = new NameIterator(names);
        return iterator;
    }
}
