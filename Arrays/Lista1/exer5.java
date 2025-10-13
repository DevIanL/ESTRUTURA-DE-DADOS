package Arrays.Lista1;

public class exer5 {                                                                                    /* Faça um programa que leia 20 números inteiros e armazene-os num vetor. 
                                                                                                        Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. */
    public static void main(String[] args) {
        int[] numeros = new int[20];                                                                    // Crei os Vetores dos numeros inteiros, pares e impares.                                                    
        int[] pares = new int[20];
        int[] impares = new int[20];
        int par = -1;                                                                                   // Contador dos pares e impares que começa em -1 pois ao idetificarem se é par o impar, ja é acressentedo o valor ao contador que irá portanto corresponder ao indice 0.
        int impar = -1;
        
        for(int i=0; i < numeros.length; i++){                                                          // For para receber 20 numeros.
            numeros[i] = Integer.parseInt(System.console().readLine("Digite um inteiro: "));
            
            if (numeros[i] %2 ==0) {                                                                    // Identifica se é par ou impar e acrescenta ao vetor correspondente.
                par ++;
                pares[par] = numeros[i];   
            }else{
                impar ++;
                impares[impar] = numeros[i];
            }
        }
       
        System.out.println("NUMEROS INTEIROS: ");                                                      // Imprime os Vetores                                                                                                                 
        for(int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("NUMEROS PARES: ");
        for(int i=0; i <= par; i++){
            System.out.println(pares[i]);
        }

        System.out.println("NUMEROS IMPARES: ");
        for(int i=0; i <= impar; i++){
            System.out.println(impares[i]);
        }
    }
}
