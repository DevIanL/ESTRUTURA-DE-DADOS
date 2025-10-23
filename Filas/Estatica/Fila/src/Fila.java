package Filas.Estatica.Fila.src;

public  interface Fila{
    boolean esta_cheia();
    boolean esta_vazia();
    String imprimir();

    void enfileirar(Object dado);
    Object desenfileirar();
    
}

