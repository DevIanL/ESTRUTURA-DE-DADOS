package Pilhas.Estatica.PilhaDupla.src;

public interface Pilha {
    boolean esta_vazia();
    boolean esta_cheia();
    String imprimir_pilha1();
    String imprimir_pilha2();
    Object desempilhar_pilha1();
    Object desempilhar_pilha2();
    void empilhar_pilha1(Object dado);
    void empilhar_pilha2(Object dado);
    Object ler_pilha1();
    Object ler_pilha2();
}
