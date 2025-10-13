package src;

public class ListaEstatica implements Lista{
    private Aluno[] lista;
    private int qtd;

    public ListaEstatica(){
        this(10);
    }

    public ListaEstatica(int tamanho){
        lista = new Aluno[tamanho];
        qtd = 0;
    }

    @Override
    public int tamanho_lista(){
        return qtd;
    }

    @Override
    public boolean esta_cheia(){
        return qtd == lista.length;
    }

    @Override
    public boolean esta_vazia(){
        return qtd == 0;
    }

    @Override
    public void adicionar_item_fim(Aluno a){
        if(!esta_cheia()){
            lista[qtd] = a;
            qtd++;
        }else{
            System.out.println("Lista esta cheia.");
        }
    }

    @Override
    public void adicionar_item_inicio(Aluno a){
        if(!esta_cheia()){
            for(int i=qtd-1; i >=0; i--){
                lista[i+1] = lista[i];
            }
            lista[0] = a;
            qtd ++;
        }else{
            System.out.println("Lista esta cheia.");
        }
    }

    @Override
    public void adicionar_item_meio(int x, Aluno a){
        if(!esta_cheia()){  
            for(int i=qtd-1; i >= x; i--){
                lista[i+1] = lista[i];
            }
            lista[x] = a;
            qtd++;
        }else{
            System.out.println("Lista esta cheia.");
        }
    }

    @Override
    public void remover_item_inicio(){
        if(!esta_vazia()){
            for(int i=0; i<qtd-1; i++){
                lista[i] = lista[i+1];
            }
            qtd--;
        }else{
            System.out.println("Lista esta vazia.");
        }
    }

    @Override
    public void remover_item_meio(int x){
        if(!esta_vazia()){
            for(int i=x; i<qtd-1; i++){
                lista[i] = lista[i+1];
            }
            qtd --;
        }else{
            System.out.println("Lista está vazia.");
        }
    }

    @Override
    public void remover_item_fim(){
        if(!esta_vazia()){
            qtd --;
        }else{
            System.out.println("Lista esta vazia.");
        }
    }

    @Override
    public void imprimir(){
        for(int i=0; i<qtd; i++){
            lista[i].get_dados();
        }
    }
}
