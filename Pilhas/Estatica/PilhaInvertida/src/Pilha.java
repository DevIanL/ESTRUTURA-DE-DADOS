package Pilhas.Estatica.PilhaInvertida.src;

public interface Pilha {
    boolean esta_cheia();
    boolean esta_vazia();
    String imprimir();

    void empilhar(Object dado);
    Object desempilhar();
    Object ler();
} 
