package Arrays.Lista1;

public class exer1 {                            // Faça um programa que leia um vetor de 5 números inteiros e mostre-os.
    public static void main(String[] args) {
        int[] numeros = {5,4,3,6,5};            // Criei um vetor com 5 posicoes, cada uma armazenando um valor inteiro.

        for(int i=0; i < numeros.length; i++){  // Criei um for para que ele comece a partir do indice 0 e chege até o maior indice
            System.out.println(numeros[i]);     // Printa o conteudo do vetor "numeros" no indice i.
        }
    }
}