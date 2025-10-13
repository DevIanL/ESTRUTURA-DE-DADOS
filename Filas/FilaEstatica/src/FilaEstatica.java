package Filas.FilaEstatica.src;

public class FilaEstatica {
    private Object[] dados;
    private int inicio;
    private int fim;

    public FilaEstatica(int tamanho){
        dados = new Object[tamanho];
        fim = -1;
        inicio = 0;
    }

    public FilaEstatica(){
        this(10);
    }

    public boolean esta_vazia(){
        return (fim == inicio - 1);
    }

    public boolean esta_cheia(){
        return (fim == dados.length -1);
    }

    public String imprimir(){
        String retorno = "[";
        for(int i=inicio; i <= fim; i++){
            retorno += dados[i] + " ";
        }
        retorno += "]";
        return retorno;
    }

    public void enfileirar(Object dado){
        if(!esta_cheia()){
            fim++;
            dados[fim] = dado;
        }else{
            System.out.println("está cheia.");
        }
    }

    public Object desenfileirar(){
        Object retorno = null;
        if(!esta_vazia()){
            retorno = dados[inicio];
            inicio++;
        }else{
            System.out.println("está vazia.");
        }
        return retorno;
    }

    public Object ler(){
        Object retorno = null;
        if(!esta_vazia()){
            retorno = dados[inicio];
        }else{
            System.out.println("está vazia.");
        }
        return retorno;
    }
}
