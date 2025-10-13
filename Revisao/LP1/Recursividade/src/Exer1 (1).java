package Revisao.LP1.Recursividade.src;

public class Exer1 {

    private boolean primo(int n){
        int aux = 0;
        for(int i=n; i>=1;i--){
            if(n % i == 0){
                aux++;
            }
        }
        return aux == 2;
    }

    private int prox_primo(int n){
        int aux = 0;
        for(int i=n-1; i>=1; i--){
            if(primo(i)){
                aux = i;
                return aux;
            }
        }
        return -1;
    }

    public int soma_primos(int n){

        if(n < 2){
            return 0;
        }

        if(n == 2){
            return 2;
        }

        if(!primo(n)){
            n = prox_primo(n);
        }

        return n + soma_primos(prox_primo(n));
    }
}
