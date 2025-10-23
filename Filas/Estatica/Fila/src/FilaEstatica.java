package Filas.Estatica.Fila.src;

public class FilaEstatica implements Fila{
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

    @Override
    public boolean esta_vazia(){
        return (fim == inicio - 1);
    }

    @Override
    public boolean esta_cheia(){
        return (fim == dados.length -1);
    }

    @Override
    public String imprimir(){
        String retorno = "[";
        for(int i=inicio; i <= fim; i++){
            retorno += dados[i] + " ";
        }
        retorno += "]";
        return retorno;
    }

    @Override
    public void enfileirar(Object dado){
        if(!esta_cheia()){
            fim++;
            dados[fim] = dado;
        }else{
            System.out.println("está cheia.");
        }
    }

    @Override
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
}
