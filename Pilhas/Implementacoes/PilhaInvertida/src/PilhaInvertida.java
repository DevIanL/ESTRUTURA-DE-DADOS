package Pilhas.Implementacoes.PilhaInvertida.src;

public interface PilhaInvertida {
    public boolean esta_cheia();
    public boolean esta_vazia();
    public String imprimir();

    public void empilhar(Object dado);
    public Object desempilhar();
    public Object ler();
}
