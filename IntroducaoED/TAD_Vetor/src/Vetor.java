package IntroducaoED.TAD_Vetor.src;

public class Vetor {
    private final int min;
    private final int max;
    private final int vaga;
    private int repetir;
    private int tamanho;
    private int[] vetor;

    public Vetor(int min,int max, int vaga, int repetir, int tamanho){
        this.min = min;
        this.max = max;
        this.vaga = vaga;
        this.repetir = repetir;
        this.tamanho = tamanho;

        vetor = new int[this.tamanho];
        for(int i=0; i<this.tamanho; i++){
            vetor[i] = this.vaga;
        }
    }

    private boolean posicao_valida(int posicao){
        return posicao >= 0 && posicao < tamanho;
    }

    private boolean valor_valido(int valor){
        return valor >= min && valor <=max;
    }

    private boolean pode_repetir(){
        return repetir == 1;
    }

    public int atribuir(int valor, int posicao){
        // Verifica se a posicao é valida.
        if(!posicao_valida(posicao)){
            return 1;
        }

        // Verifica se o valor é valido.
        if(!valor_valido(valor)){
            return 2;
        }

        // Verifica se a posicao esta vaga.
        if(vetor[posicao] != vaga){
            return 3;
        }

        // Verifica se o valor é repetido (se for o caso).
        if(!pode_repetir()){
            int[] vetor_auxiliar = localizar(valor, 0);
            if(vetor_auxiliar[0] != 0){
                return 4;
            }
        }

        vetor[posicao] = valor;
        return 0;
    }

    public int alterar(int valor, int posicao){
        // Verifica se a posicao é valida.
        if(!posicao_valida(posicao)){
            return 1;
        }

        // Verifica se o valor é valido.
        if(!valor_valido(valor)){
            return 2;
        }

        // Verifica se a posicao esta vaga.
        if(vetor[posicao] == vaga){
            return 3;
        }

        // Verifica se o valor é repetido (se for o caso).
        if(!pode_repetir()){
            int[] vetor_auxiliar = localizar(valor, 0);
            if(vetor_auxiliar[0] != 0){
                return 4;
            }
        }

        vetor[posicao] = valor;
        return 0;
    }

    public int remover(int posicao){
        if(!posicao_valida(posicao)){
            return 1;
        }

        if(vetor[posicao] == vaga){
            return 3;
        }
        
        vetor[posicao] = vaga;
        return 0;
    }

    public int ler(int posicao){
        if(!posicao_valida(posicao)){
            return 1;
        }
         return vetor[posicao];
    }

    public int[] localizar(int valor, int n_vezes){
        int[] retorno = new int [tamanho];

        if(!valor_valido(valor)){
            return retorno;
        }

        if(!pode_repetir()){
            n_vezes = 1;
        }

        for(int i=0; i<tamanho; i++){
            if(valor == vetor[i]){
                retorno[0]++;
                retorno[retorno[0]] = i;
                if(retorno[0] == n_vezes){
                    break;
                }
            }
        }

        return retorno;
    } 

    public int adicionar_1posicao(int valor){
        if(!valor_valido(valor)){
            return 2;
        }

        for(int i=0; i<tamanho; i++){
            if(vetor[i] == vaga){
                return atribuir(valor, i);
            }
        }

        return -1;
    }

    public int remover_Uposicao(){
        for(int i=vetor.length-1; i>=0; i--){
            if(vetor[i] != vaga){
                vetor[i] = vaga;
                break;
            }  
        }
        return-1;
    }

    public void imprimir(){
        String impressao = "[";
        for(int i=0; i<tamanho; i++){
            if(i != tamanho -1){
                impressao += vetor[i]+ ", ";
            }else{
                impressao += vetor[i];
            }
        }
        impressao +="]";
        System.out.println(impressao);
    }
}