package book.java.generics;

public interface KeyValue<K, V> {
    public K getKey();
    public V getValue();
    public void setValue(V value);
}