package Pilhas.Implementacoes.PilhaInvertida.src;

public class PilhaInvertidaM {
    private int topo;
    private Object[] dados;

    public PilhaInvertidaM(int tamanho){
        dados = new Object[tamanho];
        topo = dados.length;
    }

    public PilhaInvertidaM(){
        this(10);
    }

    public boolean esta_cheia(){
        return (topo == 0);
    }

    public boolean esta_vazia(){
        return (topo == dados.length);
    }

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

    public Object ler(){
        Object dado = null;
        if(!esta_vazia()){
            dado = dados[topo];
        }else{
            System.out.println("está vazia");
        }
        return dado;
    }

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

    public void empilhar(Object dado){
        if (!esta_cheia()) {
            topo --;
            dados[topo] = dado;
        }else{
            System.out.println("pilha está cheia.");
        }
    }
}
