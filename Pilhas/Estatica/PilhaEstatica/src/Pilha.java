package Pilhas.Estatica.PilhaEstatica.src;

public interface Pilha {

    /* 
    CRUD: Create, Read, Update, Delete
          Criar,  Ler,  Atualizar, Excluir 
    */ 
    
    // METODOS PRINCIPAIS; crud.
    void empilhar(Object dado);
    Object ler();
    Object desempilhar();

    // METODOS AUXILIARES
    boolean esta_cheia();
    boolean esta_vazia();
    String imprimir(); 
}
