package Arrays.Lista1;

public class exer3 {                            // Faça um programa que leia 4 notas, mostre as notas e a média na tela.
    public static void main(String[] args){
        double[] notas = {2, 2.2, 3, 8.9};      // Vetor armazenando as notas.
        double soma = 0;                        
        double media = 0;

        for(int i =0; i < notas.length; i++){   // Roda a quantidade até somar todos as posições.
            soma += notas[i];                   // Soma todas as posições e armazena em "soma".
            System.out.println(notas[i]);
        }

        media = soma / notas.length;
        System.out.println(soma);
        System.out.println(media);
    }
}
