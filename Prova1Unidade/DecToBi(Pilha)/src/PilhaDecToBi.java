public class PilhaDecToBi implements Pilha{

    private int topo;
    private Object[] pilha;

    PilhaDecToBi(int tamanho){
        topo = -1;
        pilha = new Object[tamanho];
    }

    PilhaDecToBi(){
        this(10);
    }

    @Override
    public boolean esta_cheio() {
        return topo == pilha.length -1;
    }

    @Override
    public boolean esta_vazio(){
        return topo == -1;
    }

    @Override
    public void empilhar(Object a){
        if(!esta_cheio()){
            topo ++;
            pilha[topo] = a;
        }else{
            System.err.println("Pilha cheia.");
        }
    }

    @Override
    public Object desempilhar(){
        Object temp = null;
        if (!esta_vazio()) {
            temp = pilha[topo];
            topo --;
        }else{
            System.err.println("Pilha vazia.");
        }
        return temp;
    } 

    @Override
    public String imprimir() {
        String resposta = "[";
        for(int i=topo; i>=0; i--){
            resposta += pilha[i];
        }
        resposta += "]";
        return resposta;
    }

    @Override
    public String DecToBin(String data){
        int dado = Integer.parseInt(data);
        int resto = 0;
        topo = -1;
        while (dado >= 1) {
            resto = dado %2;
            empilhar(resto);
            dado = dado/2;
        }
        return imprimir();
    }
}