package Prova1Unidade.Exercicios.src;

public interface Lista <E>{
    
    /* OPERACOES FUNDAMENTAIS DE TODA LISTA: CRUD */
    void add(E element);
    E read(int index);
    int index_off(E element);
    void update(int index);
    E delete(int index);
    void clear();

    /* PARA CONTROLE DE CONTATOS EM UM APLICATIVO DE TELEFONE */
    String lista_contatos();        
    int encontrar_numero(E element);
    E encontrar_contato(int numero);
    E contatos_recentes();

    /* PARA CONTROLE DE ITENS EM UM CARRINHO DE COMPRAS ONLINE */
    double soma_total(E element);
    void salvar_carrinho();
    
    /* PARA REGISTRO DE PACIENTES EM SISTEMA DE SAUDE */
    void listar_pacientes_atendidos();

    /* CONTROLE DE TAREFAS EM UM APLICATICO DE AFAZERES */
    boolean verificar_tarefa(E element);
    boolean desverificar_tarefa();

    /* CONTROLE DE ENCOMENDAS EM UM SISTEMA DE ENTREGAS */
    E localizar_entrega(E element);
    String localizar_todas_entregas();
}
