package book.java.generics;

public class Square implements KeyValue<Integer, Integer> {

    private Integer n;

    public Square(Integer n) {
        super();
        this.n = n;
    }

    @Override
    public Integer getKey() {
        return n;
    }

    @Override
    public Integer getValue() {
        return n * n;
    }

    @Override
    public void setValue(Integer n) {
        throw new UnsupportedOperationException(
            "square is read-only."
        );
    }
}