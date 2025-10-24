package Pilhas.Estatica.PilhaEstatica.src;

public class PilhaEstatica implements Pilha{

    // CRIANDO ATRIBUTOS DA CLASSE:
    private int topo;                           // Armazena a posição do topo da pilha.
    private Object[] dados;                     // Armazena os dados contidos na pilha.
    
    // CRIANDO OS CONSTRUTORES:
    public PilhaEstatica(int tamanho){          // Contrstrutor que tem como parametro o tamanho da pilha.
        topo = -1;                              // A pilha sempre comeca vazia.
        dados = new Object[tamanho];            // O vetor recebe o tamanho da pilha.
    }

    public PilhaEstatica(){                     // Se por acaso for criado um objeto sem parametros, o padrao será 10 para o tamanho da pilha.
        this(10);
    }

    // METODOS AUXILIARES:
    @Override
    public boolean esta_vazia(){                // A pilha sempre vai estar vazia quando o topo for igual a -1.
        return (topo == -1);
    }

    @Override
    public boolean esta_cheia(){                 // A pilha está cheia quando o valor do topo (o indice do vetor), corresponder ao tamanho do vetor.
        return (topo == dados.length -1);        // Tamanho -1, pois, se o tamanho for igual a 10, o indice do vetor irá de 0 a 9.
    }

    @Override
    public String imprimir(){
        String resultado = "[";
        for(int i=topo; i>=0; i--){
            resultado += dados[i] + ",";
        }
        return resultado + "]";
    }

    // METODOS PRINCIPAIS:
    @Override
    public Object ler(){
        Object topo = null;
        if(!esta_vazia()){
            topo = dados[this.topo];
        }else{
            System.out.println("Pilha está vazia");
        }
        return topo;
    }

    @Override
    public Object desempilhar(){
        Object temp = null;
        if(!esta_vazia()){
            temp = dados[topo];
            this.topo --;
        }else{
            System.out.println("Pilha está vazia");
        }
        return temp;
    }

    @Override
    public void empilhar(Object dado){
        if(!esta_cheia()){
            topo ++;
            dados[topo] = dado;
        }else{
            System.out.println("Pilha está cheia");
        } 
    }
}
