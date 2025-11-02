package Listas.Dinamica.ListaDuplamenteEncadeada.src;

public interface Lista <E>{

    void add(E element);
    int indexOf(E element);
    E get(int index);
    String printList();
    E remove(int index);
    int size();
    boolean isEmpty();
}
