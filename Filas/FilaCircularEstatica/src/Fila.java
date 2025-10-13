package Filas.FilaCircularEstatica.src;

public interface Fila {
    void adicionar_elemento(Object a);
    Object ler_elemento();
    void imprimir_lista();
    Object atualizar_elemento(Object a);
    Object remover_elemento();
    boolean esta_cheia();
    boolean esta_vazia();
    void esvaziar_lista();
} 
