package Pilhas.Implementacoes.PilhaDupla.src;

public class PilhaDupla {
    private Object[] dados;
    private int p1, p2;

    public PilhaDupla(int tamanho){
        dados = new Object[tamanho];
        p1 = -1;
        p2 = dados.length;
    }
    
    public PilhaDupla(){
        this(10);
    }

    public boolean esta_cheia(){
        return (((p1+1) + (dados.length - p2)) == dados.length);
    }

    public boolean esta_vazia(){
        return (p1 == -1 && p2 == dados.length);
    }

    public String imprimir_pilha1(){
        String retorno = "[";    
        for(int i=p1; i >= 0; i--){
            retorno += dados[i] + " ";
        }
        retorno += "]";
        return retorno;
    }

    public String imprimir_pilha2(){
        String retorno = "[";
        for(int i=p2; i < dados.length; i++){
            retorno += dados[i] + " ";
        }
        retorno += "]";
        return retorno;
    }

    public Object ler_pilha1(){
        Object dado = null;
        if (!esta_vazia()){
                dado = dados[p1];
            }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public Object ler_pilha2(){
        Object dado = null;
        if (!esta_vazia()){
                dado = dados[p2];
            }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public Object desempilhar_pilha1(){
        Object dado = null;
        if (!esta_vazia()){ 
            dado = dados[p1];
            dados[p1] = null;
            p1--;
        }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public Object desempilhar_pilha2(){
        Object dado = null;
        if (!esta_vazia()) {
            dado = dados[p2];
            dados[p2] = null;
            p2 ++;
        }else{
            System.out.println("está vazia.");
        }
        return dado;
    }

    public void empilhar_pilha1(Object dado){
        if(!esta_cheia()){
            p1 ++;
            dados[p1] = dado;
        }else{
            System.out.println("está cheia.");
        }
    }

    public void empilhar_pilha2(Object dado){
        if(!esta_cheia()){
            p2 --;
            dados[p2] = dado;
        }else{
            System.out.println("está cheia.");
        }
    }
}