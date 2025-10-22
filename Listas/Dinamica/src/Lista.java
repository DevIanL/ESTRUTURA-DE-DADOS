public interface Lista <Generico>{

    void adicionar(Generico elemento);
    Generico remover(Generico elemento);
    boolean procurar(Generico elemento);
    int index_off(Generico elemento);
    Generico get(int index);
    void limpar();
    int tamanho();
    String imprimir();
}
