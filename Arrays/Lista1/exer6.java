package Arrays.Lista1;

public class exer6 {                            /* Faça um programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, 
                                                   imprima o número de alunos com média maior ou igual a 7.0. */
    public static void main(String[] args) {

        double[] media = new double[10];                                                                                // Criei os vetores para as medias e as notas.                                    
        double[] nota1 = new double[10];                                                                                                                   
        double[] nota2 = new double[10];
        double[] nota3 = new double[10];
        int alunos = 3;

        for(int i=0; i < alunos; i++){                                                                                  // For para receber as notas e calcular a media.
            nota1[i] = Double.parseDouble(System.console().readLine("Digite a primeira nota do auno " + i + ": "));
            nota2[i] = Double.parseDouble(System.console().readLine("Digite a segunda nota do auno " + i + ": "));
            nota3[i] = Double.parseDouble(System.console().readLine("Digite a terceira nota do auno " + i + ": "));
            media[i] = (nota1[i]+nota2[i]+nota3[i])/3;
        }

        for(int i=0; i <= alunos; i++){                                                                                 // For para identificar e imprimir as medias maiores ou iguais a 7.0.
            if(media[i] >= 7){
                System.out.println(media[i]);
            }       
        }
    }
}