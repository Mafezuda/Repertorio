public class StaticLista <T> {

    private int size;
    private T[] data;

    public StaticLista (int size){
        this.data = (T[]) new Object[size];
    }

}