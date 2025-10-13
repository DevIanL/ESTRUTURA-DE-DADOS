package src;

public interface Lista {
    int tamanho_lista();
    boolean esta_cheia();
    boolean esta_vazia();
    void adicionar_item_fim(Aluno a);
    void adicionar_item_inicio(Aluno a);
    void adicionar_item_meio(int x, Aluno a);
    void remover_item_inicio();
    void remover_item_meio(int x);
    void remover_item_fim();
    void imprimir();
}
