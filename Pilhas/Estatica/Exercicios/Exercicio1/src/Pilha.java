package Pilhas.Estatica.Exercicios.Exercicio1.src;

public class Pilha {
     private int[] pilha;
    private int topo;
    private int tamanho;
    private int repetir;

    public Pilha(){
        this(5);
    }

    public Pilha(int tamanho){
        pilha = new int[tamanho];
        this.tamanho = tamanho;
        topo = -1;
    }

    public int get_elements(){
        return topo + 1;
    }

    public int get_topo(){
        return topo;
    }

    public int localizar_elemento(int elemento){
        for(int i=topo; i>=0; i--){
            if(pilha[i] == elemento){
                return i;
            }
        }
        return -1;
    }
    
    public void set_repetir(int a){
        repetir = a;
    }

    private boolean repetir(){
        return repetir == 1;
    }

    public void inserir(int elemento){
        int aux = 0;
        if(topo != tamanho -1){
            if(!repetir()){
                for(int i=topo +1; i>=0; i--){
                    if(pilha[i] == elemento){
                        System.out.println("item repetido.");
                        aux ++;
                        break;
                    }
                }
                if(aux == 0){
                    topo++;
                    pilha[topo] = elemento;
                } 
            }else{
                topo++;
                pilha[topo] = elemento;
            }
        }else{
            System.out.println("pilha cheia.");
        }
    }

    public int remover(){
        int retorno = -1;
        if (topo != -1) {
            retorno = pilha[topo];
            topo --;
        }else{
            System.out.println("pilha vazia.");
        }
        return retorno;
    }

    public String imprimir(){
        String retorno = "[";
        for(int i=0; i <=topo; i++){
            if(i == topo){
                retorno += pilha[i];
            }else{
                retorno += pilha[i] + ", ";
            }
        }
        retorno += "]";
        return retorno;
    }
}
