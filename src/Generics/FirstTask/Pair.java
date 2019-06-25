package Generics.FirstTask;

public class Pair<T, V> {
    private T one;
    private V two;

    public Pair(T one, V two) {
        this.one = one;
        this.two = two;
    }

    public T getFirst() {
        return this.one;
    }

    public V getSecond() {
        return this.two;
    }
}
