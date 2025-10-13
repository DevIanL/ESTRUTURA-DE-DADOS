package Revisao.ED.Unidade1.src;

public class FilaEstatica extends ListaGenerica{
    private int inicio, fim;
    private Object[] fila;

    FilaEstatica(int tamanho){
        inicio = 0;
        fim = -1; 
        fila = new Object[tamanho];
    }

    FilaEstatica(){
        this(10);
    }

    @Override
    public boolean esta_cheia(){
        return fim == fila.length-1;
    }

    @Override
    public boolean esta_vazia(){
        return fim == inicio -1;
    }

    @Override
    public void esvaziar_lista(){
        inicio = 0;
        fim = -1;
    }

    @Override
    public void imprimir_lista(){
        System.out.print("[");
        for(int i = inicio; i <=fim; i++){
            System.out.print(fila[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public Object ler_elemento(){
        Object temp = null;
        if(!esta_vazia()){
            temp = fila[inicio];
        }else{
            System.err.println("Fila vazia.");
        }
        return temp;
    }

    @Override
    public Object remover_elemento(){
        Object temp = null;
        if(!esta_vazia()){
            temp = fila[inicio];
            inicio++;
        }else{
            System.err.println("Fila vazia.");
        }
        return temp;
    }

    @Override
    public void adicionar_elemento(Object a){
        if(!esta_cheia()){
            fim ++;
            fila[fim] = a;
        }else{
            System.err.println("Fila cheia");
        }
    }

    @Override
    public Object atualizar_elemento(Object a){
        Object temp = null;
        if (!esta_vazia()) {
            temp = fila[fim];
            fila[fim] = a;
        }else{
            System.err.println("Fila vazia.");
        }
        return temp;
    }
}