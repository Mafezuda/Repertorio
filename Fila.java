public class Fila <T> {
    private int top;
    private int base;
    private T[] data;

    public Fila (int size){
        this.data = (T[]) new Object[size];
    }
    
} 
