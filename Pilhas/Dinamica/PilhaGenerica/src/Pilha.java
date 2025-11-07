package Pilhas.Dinamica.PilhaGenerica.src;

public interface Pilha <E>{
    
    boolean isEmpty();
    void empilhar(E element);
    E desempilhar();
    E[] toArray();
    E get();
    void atualizar(E element);
    String imprimir();
}
