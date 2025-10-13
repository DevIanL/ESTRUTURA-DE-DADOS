package Arrays.ExerciciosAParte.atvd3POO.src;

public class Pilha {

    private int[] pilha;
    private int topo;

    public Pilha (int tamanho){
        pilha = new int[tamanho];
        topo = -1;
    }

    public Pilha (){
        this(10);
    }

    public boolean esta_cheia(){
        return (topo == pilha.length - 1);
    }

    public boolean esta_vazia(){
        return (topo == -1);
    }

    public void empilhar (int numero){
        if (esta_cheia()) {
            System.out.println("esta cheia.");
        }else{
            topo++;
            pilha[topo] = numero;
        }
    }

    public Integer desempilhar(){
        Integer retorno = null;
        if(esta_vazia()){
            System.out.println("esta vazia.");
        }else{
            retorno = pilha[topo];
            topo--;
        }
        return retorno;
    }

    public String mostrar(){
        String retorno = "";
        if (esta_vazia()) {
            System.out.println("esta vazia.");
        }else{
            for(int i=topo; i>=0; i--){
                retorno += pilha[i] + ",";
            }
        }
        return retorno;
    }
}
