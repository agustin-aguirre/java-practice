public class GenericBox<T> {
    T storedElement;

    public void save(T element) {
        storedElement = element;
    }

    public T get() {
        return storedElement;
    }
}
