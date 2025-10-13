package Arrays.Lista1;

public class exer7 {                            //Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
    public static void main(String[] arg){
        int[] vetor = {2,4,6,8,10};             // Vetor que guarda os 5 inteiros.
        int soma = 0;                           // Variavel soma que armazena a soma total dos 5 numeros.
        int multiplicação = 1;                  // A mesma coisa para a multiplicacao.
        String valor = "[";                         

        for(int i=0; i<vetor.length; i++){
            soma += vetor[i];
            multiplicação *= vetor[i];
        }
        System.err.println(soma);
        System.out.println(multiplicação);

        for(int i=0; i < vetor.length; i++){
            valor += vetor[i] + " ";
        }
        valor +="]";

        System.out.println(valor);
        
    }
}