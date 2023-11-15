public class NameIterator implements Iterator {
    private String[] data;
    private int index = 0;

    public NameIterator(String[] data) {
        this.data = data;
    }

    public boolean hasNext() {
        if (index < data.length) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return data[index++];
        }
        return null;
    }
}
