package EstrutrurasDados.ListaEncadeada;

public class No <E>{
    
    private E dado;
    private No<E> anterior;
    private No<E> proximo;

    public No(E dado){
        this.dado = dado;
        proximo = null;
        anterior = null;
    }

    public E get_dado(){
        return dado;
    }

    public No<E> get_proximo(){
        return proximo;
    }

    public No<E> get_anterior(){
        return anterior;
    }

    public void set_proximo(No<E> no){
        proximo = no;
    }

    public void set_anterior(No<E> no){
        anterior = no;
    }

    public void set_dado(E dado){
        this.dado = dado;
    }
}
