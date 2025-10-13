package Arrays.Lista1;

public class exer2 {                                                // Faça um programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
    public static void main(String[] args) {
        double[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};          // Criei um vetor que arazena 10 numeros, float por aceitar numeros reais.
        int tamanho = numeros.length;                               // Armazena o tamanho do vetor.
        double[] ordem_invertida = new double[tamanho];             // Vetor que armazena os valores de "numeros" de traz para frente.
        
        for(int i=0; i < numeros.length; i++){                      // Roda a quantidade de posições do vetor "numeros".
            ordem_invertida[tamanho -1] = numeros[i];               // Armazena o valor da primeira posição do vetor "numeros" na ultima posicaçao vazia de "ordem_invertida".
            tamanho --;
        }

        for(int i=0; i < ordem_invertida.length; i++){              // imprimi os valores do vetor "ordem_invertida"
            System.out.println(ordem_invertida[i]);
        }
    }
}
