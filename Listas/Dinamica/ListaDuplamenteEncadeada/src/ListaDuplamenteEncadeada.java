package Listas.Dinamica.ListaDuplamenteEncadeada.src;

public class ListaDuplamenteEncadeada <E> implements Lista<E>{
    private No<E> inicio;
    private No<E> fim;
    private int size;

    public ListaDuplamenteEncadeada(){
        inicio = null;
        fim = null;
        size = 0;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public int indexOf(E element){
        int index = -1;

        if(!isEmpty()){
            No<E> aux = inicio;
            index = 0;

            while (aux != null) {
                if(aux.getDado().equals(element)){
                    break;
                }
                
                if(aux.getProximo() == null){
                    throw new IllegalArgumentException("Elemento não encontrado.");
                }

                aux = aux.getProximo();
                index ++;
            }
        }else{
            throw new RuntimeException("Lista vazia.");
        }
        
        return index;
    }

    @Override 
    public E get(int index){
        E element = null;

        if(!isEmpty()){
            if(index >=0 && index < size()){
                No<E> aux = inicio;

                for(int i=0; i<index; i++){
                    aux = aux.getProximo();
                }

                element = aux.getDado();
            }else{
                throw new IndexOutOfBoundsException("Indice fora do limite");
            }
        }else{
            throw new RuntimeException("Lista vazia.");
        }

        return element;
    }

    @Override
    public String printList(){
        String print = "[";
        No<E> aux = inicio;
        
        while (aux != null) {
            if(aux.getProximo() == null){
                print += aux.getDado();
            }else{
                print += aux.getDado() + ", ";
            }

            aux = aux.getProximo();
        }

        print +="]";
        return print;
    }

    @Override
    public void add(E element){
        No<E> aux = new No<>(element);

        if(isEmpty()){
            inicio = aux;
        }else{
            fim.setProximo(aux);
            aux.setAnterior(fim);
        }

        fim = aux;
        size++;
    }

    @Override
    public E remove(int index){
        E dado = null;

        if(!isEmpty()){
            if(index >= 0 && index < size()){
                if (index <= ((size()-1)/2)) {
                    No<E> aux = inicio;

                    for(int i=0; i<index; i++){
                        aux = aux.getProximo();
                    }

                    dado = aux.getDado();
                    No<E> anterior = aux.getAnterior();
                    No<E> proximo = aux.getProximo();

                    if(anterior != null){
                        anterior.setProximo(proximo);
                    }else{
                        inicio =inicio.getProximo();
                    }

                    if(proximo != null){
                        proximo.setAnterior(anterior);
                    }else{
                        fim = fim.getAnterior();
                    }

                }else{
                    No<E> aux = fim;
                    for(int i=0; i<size()-1-index; i++){
                        aux = aux.getAnterior();
                    }

                    dado = aux.getDado();
                    No<E> anterior = aux.getAnterior();
                    No<E> proximo = aux.getProximo();

                    if(anterior != null){
                        anterior.setProximo(proximo);
                    }else{
                        inicio =inicio.getProximo();
                    }

                    if(proximo != null){
                        proximo.setAnterior(anterior);
                    }else{
                        fim = fim.getAnterior();
                    }
                }
                size--;

            }else{
                throw new IndexOutOfBoundsException("Indice invalido.");
            }
        }else{
            throw new RuntimeException("Lista vazia.");
        }

        return dado;
    }
}
