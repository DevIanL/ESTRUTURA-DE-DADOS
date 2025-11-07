package Pilhas.Dinamica.PilhaGenerica.src;

public class No <E>{
    private E dado;
    private No<E> proximo;
    private No<E> anterior;

    public No(E dado){
        this.dado = dado;
        proximo = null;
        anterior = null;
    }

    public No<E> getAnterior() {
        return anterior;
    }
    
    public No<E> getProximo() {
        return proximo;
    }

    public E getDado() {
        return dado;
    }

    public void setAnterior(No<E> anterior) {
        this.anterior = anterior;
    }

    public void setProximo(No<E> proximo) {
        this.proximo = proximo;
    }

    public void setDado(E dado) {
        this.dado = dado;
    }
}
