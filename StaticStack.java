public class StaticStack <T> {
    private int top = -1;
    private T[] data;

    public StaticStack (int size){
        this.data = (T[]) new Object[size];
    }

    public void push (T elemento){
        if (isFull()){
            throw new StackOverflowError("Está cheio");
        }
        data [++ top] = elemento;
    }

    public T pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Está vazia");
        }
        return data[top--];
    }

    public void clear(){
        top = -1;
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty (){
        return top == -1;
    }
}