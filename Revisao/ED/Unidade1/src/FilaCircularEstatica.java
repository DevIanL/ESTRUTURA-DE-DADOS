package Revisao.ED.Unidade1.src;

public class FilaCircularEstatica extends ListaGenerica{
    private int inicio;
    private int fim; 
    private int quantidade;
    private Object[] fila_circular;

    FilaCircularEstatica(int tamanho){
        inicio = 0;
        fim = -1;
        quantidade = 0;
        fila_circular = new Object[tamanho];
    }

    FilaCircularEstatica(){
        this(10);
    }

    @Override
    public boolean esta_cheia(){
        return quantidade == fila_circular.length;
    }

    public boolean esta_vazia(){
        return quantidade == 0;
    }
    
    private int proximo(int indice){
        return (indice + 1) % fila_circular.length;
    }

    @Override
    public void esvaziar_lista() {
        fim = -1;
        inicio = 0;
        quantidade = 0;
    }

    @Override
    public void imprimir_lista(){
        System.out.print("[");
        int aux = inicio;
        for(int i = 0; i<quantidade; i++){
            System.out.print(fila_circular[aux] + " ");
            aux = proximo(aux);
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public Object remover_elemento(){
        Object temp = null;
        if(!esta_vazia()){
            temp = fila_circular[inicio];
            inicio = proximo(inicio);
            quantidade --;
        }else{
            System.out.println("fila vazia.");
        }
        return temp;
    }

    @Override
    public Object ler_elemento(){
        Object temp = null;
        if(!esta_vazia()){
            temp = fila_circular[inicio];
        }else{
            System.out.println("fila vazia.");
        }
        return temp;
    }

    @Override
    public void adicionar_elemento(Object a){
        if(!esta_cheia()){
            fim = proximo(fim);
            fila_circular[fim] = a;
            quantidade ++;
        }else{
            System.out.println("fila cheia.");
        }
    }   

    @Override
    public Object atualizar_elemento(Object a){
        Object temp = null;
        if(!esta_vazia()){
            temp = fila_circular[fim];
            fila_circular[fim] = a;
            return temp;
        }else{

            System.out.println("esta vazia.");
        }
        return temp;
    }
}   
    
