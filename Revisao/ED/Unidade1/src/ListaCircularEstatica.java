package Revisao.ED.Unidade1.src;

public class ListaCircularEstatica extends ListaGenerica {
    private int inicio;
    private int fim;
    private int quantidade;
    private Object[] lista;

    ListaCircularEstatica(){
        this(5);
    }

    ListaCircularEstatica(int tamanho){
        inicio = 0;
        fim = -1;
        quantidade = 0;
        lista = new Object[tamanho];
    }
    @Override
    public boolean esta_cheia(){
        return quantidade == lista.length;
    }
    @Override
    public boolean esta_vazia() {
        return quantidade == 0;
    }

    private int next(int index){
        return (index + 1) % lista.length;
    }

    private int prior(int index){
        return (index + lista.length - 1) % lista.length;
    }

    private int logico(int index){
        return (inicio + index) % lista.length;
    }

    @Override
    public void imprimir_lista(){ 
        System.out.print("[");
        int aux = inicio;
        for(int i=0; i<quantidade; i++){
            System.out.print(lista[aux] + " ");
            aux = next(aux);
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public void esvaziar_lista()
    {
        quantidade = 0;
        inicio = 0;
        fim = -1;
    }

    public Object ler_elemento(int index) {
        Object temp = null;
        if(!esta_vazia()){
            temp = lista[logico(index)];
        }else{
            System.err.println("Esta vazia.");
        }
        return temp;
    }

    public Object ler_elemento() {
        Object temp = null;
        if(!esta_vazia()){
            temp = lista[inicio];
        }else{
            System.err.println("Esta vazia.");
        }
        return temp;
    }

    public Object remover_elemento(int index){
        Object temp = null;
        if(!esta_vazia()){
            if(index >= 0 && index < quantidade){ 
                temp = lista[logico(index)];                        // Se nao estivar vazia e o indeice for válido, logo deve retornar o item que será removido.             
                if(index >= (quantidade/2)){                        // Verifica a posição do indice para tomar a decisao de qual ponta ele vai seguir para remover o item.
                    int i = logico(index);  
                    while (i != fim) {                              // Do indice até o fim;
                        lista[i] = lista[next(i)];
                        i = next(i);
                    }                             
                    quantidade --;
                    fim = prior(fim);
                }else{
                    int i = logico(index);  
                    while (i != inicio) {                           // Do indice até o inicio
                        lista[i] = lista[prior(i)];
                        i = prior(i);
                    }
                    quantidade--;
                    inicio = next(inicio);
                }
            }else{
                System.err.println("Indice invalido.");
            }     
        }else{
            System.err.println("Esta vazia.");
        }
        return temp;
    }

    @Override
    public Object remover_elemento(){
        Object temp = null;
        if(!esta_vazia()){
            inicio = next(inicio);
            quantidade --;
        }else{
            System.err.println("Esta vazia.");
        }
        return temp;
    }

    public void adicionar_elemento(int index, Object a){
        if (!esta_cheia()) {
            if(index >=0 && index <= quantidade){
                if(index >= (quantidade/2)){   
                    int fisico = logico(index);
                    int x = fim;
                    int y = next(fim);
                    for(int i=0; i<quantidade-index; i++){
                        lista[y] = lista[x];
                        x = prior(x);
                        y = prior(y);
                    }
                    lista[fisico] = a;
                    fim = next(fim);
                    quantidade++;
                }else{
                    int fisico = logico(index);
                    int x = inicio;
                    int y = prior(inicio);
                    for(int i=0; i<index; i++){
                        lista[y] = lista[x];
                        x = next(x);
                        y = next(y);
                    }
                    lista[fisico] = a;
                    inicio = prior(inicio);
                    quantidade++;  
                }
            }else{
                System.err.println("nao é um indice valido.");
            }
        }else{
            System.err.println("Está cheia.");
        }
    }

    @Override
    public void adicionar_elemento(Object a){
        if (!esta_cheia()) {
            fim = next(fim);
            lista[fim] = a;   
            quantidade ++; 
        }else{
            System.err.println("Está cheia.");
        }
    }

    public void atualizar_elemento(int index, Object a){
        if (!esta_vazia()) {
            if(index >=0 && index < quantidade){
                lista[logico(index)] = a;
            }else{
                System.err.println("nao é um indice valido.");
            }
        }else{
            System.err.println("lista vazia.");
        }
    }

    @Override
    public Object atualizar_elemento(Object a){
        Object temp = null;
        if (!esta_vazia()) {
            temp = lista[inicio];
            lista[inicio] = a;
        }else{
            System.err.println("lista vazia.");
        }
        return temp;
    }
}
