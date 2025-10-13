package Pilhas.Implementacoes.PilhaDupla.src;

public interface Pilha {
    public boolean esta_vazia();
    public boolean esta_cheia();
    public String imprimir();

    public void empilhar(Object dado);
    public Object desempilhar();
    public Object ler();
}
