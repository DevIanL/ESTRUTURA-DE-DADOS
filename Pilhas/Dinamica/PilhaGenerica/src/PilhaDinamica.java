package Pilhas.Dinamica.PilhaGenerica.src;

public class PilhaDinamica <E> implements Pilha<E>{
    private No<E> topo;
    private int size;

    public PilhaDinamica(){
        topo = null;
        size = 0;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public void empilhar(E element){
        No<E> auxNo = new No<>(element);

        if(!isEmpty()){
            auxNo.setAnterior(topo);
            topo.setProximo(auxNo);
        }  

        topo = auxNo;
        size++;
    }

    @Override 
    public E desempilhar(){
        E retorno = null;

        if(!isEmpty()){
            No<E> noAnterior = topo.getAnterior();
            retorno = topo.getDado();

            if(topo.getAnterior() != null){
                topo.setAnterior(null);
                topo = noAnterior;
                topo.setProximo(null);

            }else{
                topo = noAnterior;
            }

            size--;

        }else{
            throw new PilhaUltrapassouLimiteMinimoException("Pilha vazia.");
        }

        return retorno;
    }

    @Override
    public E get(){
        if (isEmpty()) {
            throw new PilhaUltrapassouLimiteMinimoException("Lista vazia.");
        }

        return topo.getDado();
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray(){
        E[] retorno = null;
        No<E> auxNo = topo;

        if(!isEmpty()){
            retorno = (E[]) new Object[size];
            
            for(int i= size-1; i>=0; i--){
                retorno[i] = auxNo.getDado();
                auxNo = auxNo.getAnterior();
            }

        }else{
            throw new PilhaUltrapassouLimiteMinimoException("Pilha vazia.");
        }

        return retorno;
    }

    @Override
    public void atualizar(E element){
        topo.setDado(element);
    }

    @Override
    public String imprimir(){
        String retorno = "";
        No<E> auxNo = topo;

        for(int i= 0; i<size; i++){
            if(i == size -1){
                retorno += auxNo.getDado();
            }else{
                retorno += auxNo.getDado() + "<= ";
            }
            
            auxNo = auxNo.getAnterior();
        }

        return "[" + retorno + "]";
    }
}
