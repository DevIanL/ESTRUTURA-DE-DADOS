package EstrutrurasDados.ListaEncadeada;

public interface Lista <E> {
    
    void add(E element);
    int index_off(E element);
    E get(int index);
    void update(int index, E element);
    String remove(E element);
    void clear();
}