public class StaticLista<T> {
    private int size;
    private T[] data;
    private int count;

    public StaticLista(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
        this.count = 0;
    }

    public void clear() {
        count = 0;
    }

    public void add(T item) {
        if (isFull()) {
            throw new RuntimeException("Lista está cheia!");
        }
        data[count] = item;
        count++;
    }

    public T remove(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("Lista está vazia!");
        }
        if (pos < 0 || pos >= count) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        T removedItem = data[pos];
        for (int i = pos; i < count - 1; i++) {
            data[i] = data[i + 1];
        }
        count--;
        return removedItem;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public int getSize() {
        return count;
    }

    public T getData(int pos) {
        if (pos < 0 || pos >= count) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return data[pos];
    }
 }
