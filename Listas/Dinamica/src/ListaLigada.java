public class ListaLigada<Generico> implements Lista<Generico>{

    private No<Generico> inicio;
    private int tamanho;

    public ListaLigada(){
        tamanho = 0;
        inicio = null;
    }

    private boolean esta_vazia(){
        return inicio == null;
    }

    @Override
    public void adicionar(Generico a){
        No<Generico> novo_no = new No<>(a);

        if(esta_vazia()){
            inicio = novo_no;
        }else{
            No<Generico> aux_no = inicio;

            while (aux_no.get_proximo_no() != null) {
                aux_no = aux_no.get_proximo_no();
            }

            aux_no.set_proximo_no(novo_no);
        }
        tamanho++;
    }

    @Override
    public Generico remover(Generico a){
        No<Generico> retorno = null;

        if(!esta_vazia()){
            if(inicio.get_dado().equals(a)){
                retorno = inicio;
                inicio = inicio.get_proximo_no();
                tamanho--;
            }else{
                No<Generico> aux_no = inicio;

                while (aux_no.get_proximo_no() != null) {
                    No<Generico> proximo_no = aux_no.get_proximo_no();

                    if(proximo_no.get_dado().equals(a)){
                        retorno = proximo_no;
                        aux_no.set_proximo_no(proximo_no.get_proximo_no());
                        tamanho--;
                        break;
                    }   
                    
                    aux_no = aux_no.get_proximo_no();               
                }
            }
        }else{
            System.err.println("esta vazia.");
        }
        return retorno.get_dado();
    }

    @Override
    public void limpar(){
        inicio = null;
        tamanho= 0;
    }

    @Override
    public boolean procurar(Generico a){
        boolean retorno = false;
        if(!esta_vazia()){
            No<Generico> aux_no = inicio;

            while(aux_no != null){
                if(aux_no.get_dado().equals(a)){
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    @Override
    public int index_off(Generico a){
        int retorno = -1;

        if(!esta_vazia()){
            No<Generico> aux_no = inicio;

            while (aux_no != null) {
                retorno ++;
                
                if(aux_no.get_dado().equals(a)){
                    break;
                }

                if(aux_no.get_proximo_no() == null){
                    retorno = -1;
                }

                aux_no = aux_no.get_proximo_no();
            }
        }

        return retorno;
    }

    @Override
    public String imprimir(){
        String retorno = "[";
        No<Generico> aux_no = inicio;
        
        while (aux_no != null) {
            if(aux_no.get_proximo_no() != null){
                retorno += aux_no.get_dado() + ", ";
            }else{
                retorno += aux_no.get_dado();
            }

            aux_no = aux_no.get_proximo_no();
        }
        retorno += "]";
        return retorno;
    }

    @Override
    public Generico get(int index){
        Generico retorno = null;

        if(index >= 0 && index < tamanho){
            No<Generico> aux_no = inicio;
            int index_c = 0;

            while (aux_no != null) {
                if(index_c == index){
                    retorno = aux_no.get_dado();
                }

                index_c++;
                aux_no = aux_no.get_proximo_no();
            }
        }

        return retorno;
    }

    @Override
    public int tamanho(){
        return tamanho;
    }
}
