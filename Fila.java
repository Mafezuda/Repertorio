public class Fila <T> {
    private int top;
    private int base;
    private T[] data;

    public Fila (int size){
        this.data = (T[]) new Object[size];
        this.top = 0;
        this.base = 0;
    }

    public void add(T item) {
        if (isFull()) {
            throw new RuntimeException("Fila está cheia!");
        }
        data[top] = item;
        top = (top + 1) % data.length;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila está vazia!");
        }
        T item = data[base];
        data[base] = null;
        base = (base + 1) % data.length;
        return item;
    }

    public boolean isFull() {
        return (top + 1) % data.length == base && data[top] != null;
    }

    public boolean isEmpty() {
        return top == base && data[base] == null;
    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        top = 0;
        base = 0;
    }
}