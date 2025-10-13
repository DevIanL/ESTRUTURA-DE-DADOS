package Revisao.ED.Unidade1.src;

public class PilhaEstatica extends ListaGenerica{
    
    private int vazio, topo;
    private Object[] pilha;

    // CONSTRUTORES DA PILHA.
    public PilhaEstatica(int tamanho){
        pilha = new Object[tamanho];
        vazio = -1;
        topo = -1;
    }

    public PilhaEstatica(){
        this(10);
    }

    // METODOS AUXILIARES.
    @Override
    public boolean esta_cheia(){
        return topo == pilha.length -1;
    }

    @Override
    public boolean esta_vazia(){
        return topo == vazio;
    }

    // METODODOS PRINCIPAIS
    @Override
    public void adicionar_elemento(Object a){
        if(!esta_cheia()){
            topo ++;
            pilha[topo] = a;
        }else{
            System.out.println("Nao a possivel adicionar itens na pilha, está cheia.");
        }
    }

    @Override
    public Object ler_elemento(){
        Object retorno = null;
        if(!esta_vazia()){
            retorno = pilha[topo];
        }else{
            System.out.println("a pilha está vazia.");
        }
        return retorno;
    }

    @Override
    public void imprimir_lista(){
        System.out.println("______________");
            for(int i=topo; i>=0; i--){
                System.out.println("|"+pilha[i]+"|");
            }
        System.out.println("______________");
    }

    @Override
    public Object atualizar_elemento(Object a){
        Object retorno = pilha[topo];
        pilha[topo] = a;
        return retorno;
    }

    @Override
    public Object remover_elemento(){
        Object retorno = null;
        if(!esta_vazia()){
            retorno = pilha[topo];
            topo--;          
        }else{
            System.err.println("Nao e possivel remover nenhum elemento, esta vazia.");
        }
        return retorno;
    }

    @Override 
    public void esvaziar_lista(){
        topo = -1;
    }
}
