package Filas.FilaEstatica.src;

public  interface Fila{
    public boolean esta_cheia();
    public boolean esta_vazia();
    public String imprimir();

    public void enfileirar();
    public Object desenfileirar();
    public Object desempilhar();
}
