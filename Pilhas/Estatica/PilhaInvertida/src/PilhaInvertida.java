package Pilhas.Estatica.PilhaInvertida.src;

public class PilhaInvertida implements Pilha{
    private int topo;
    private Object[] dados;

    public PilhaInvertida(int tamanho){
        dados = new Object[tamanho];
        topo = dados.length;
    }

    public PilhaInvertida(){
        this(10);
    }

    @Override
    public boolean esta_cheia(){
        return (topo == 0);
    }

    @Override
    public boolean esta_vazia(){
        return (topo == dados.length);
    }

    @Override
    public String imprimir(){
        String retorno = null;
        if(!esta_vazia()){
            retorno = "[";
            for(int i=topo; i < dados.length; i++){
            retorno += dados[i] + " ";
            }
            retorno += "]";
        }else{
            System.out.println("Pilha está vazia.");
        }
        return retorno;
    }

    @Override
    public Object ler(){
        Object dado = null;
        if(!esta_vazia()){
            dado = dados[topo];
        }else{
            System.out.println("está vazia");
        }
        return dado;
    }

    @Override
    public Object desempilhar(){
        Object dado = null;
        if(!esta_vazia()){
            dado = dados[topo];
            topo ++;
        }else{
            System.out.println("pilha está vazia.");
        }
        return dado;
    }

    @Override
    public void empilhar(Object dado){
        if (!esta_cheia()) {
            topo --;
            dados[topo] = dado;
        }else{
            System.out.println("pilha está cheia.");
        }
    }
}
