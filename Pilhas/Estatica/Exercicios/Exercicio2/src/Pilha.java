package Pilhas.Estatica.Exercicios.Exercicio2.src;

public class Pilha {
    private int topo;
    private int[] pilha;
    private int tamanho;

    public Pilha(){
        this(5);
    }

    public Pilha(int tamanho){
        topo = -1;
        this.tamanho = tamanho;
        pilha = new int[tamanho];
    }

    private boolean esta_cheio(){
        return topo == pilha.length -1;
    }

    private boolean esta_vazio(){
        return topo == -1;
    }

    public void adicionar(int dado){
        if(!esta_cheio()){
            topo++;
            pilha[topo] = dado;
        }else{
            System.err.println("pilha cheia.");
        }
    }

   public int remover(){
    int aux = -1111111111;
    if(!esta_vazio()){
        aux = pilha[topo];
        topo--;
    }else{
        System.err.println("pilha vazia.");
    }
    return aux;
   }

   public int get_tamanho(){
    return tamanho;
   }

   public int get_topo(){
    return topo;
   }

   public int get_qtd_elementos(){
    return topo +1;
   }

   public String imprimir(){
    String aux = "";
    for(int i=0; i<=topo; i++){
        if(i != topo){
            aux += pilha[i] + " => ";
        }else{
            aux += pilha[i];
        }
    }
    return aux;
   } 
}
