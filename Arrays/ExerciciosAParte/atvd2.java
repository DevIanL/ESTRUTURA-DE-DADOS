package Arrays.ExerciciosAParte;

public class atvd2 {
   public static void main(String[] args) {
        int[] numeros_inteiros = new int[20];
        int[] numeros_pares = new int[20];
        int[] numeros_impares = new int[20];
        int par = 0;
        int impar = 0;

        for(int i=0; i<20; i++){
            numeros_inteiros[i] = Integer.parseInt(System.console().readLine("Digite um numero inteiro"));
            if(numeros_inteiros[i] % 2 == 0){  
                numeros_pares[par] = numeros_inteiros[i]; 
                par++;       
            }else{
                numeros_impares[impar] = numeros_inteiros[i];
                impar++; 
            }
        }

        for(int i=0; i<20; i++){
            System.out.print(numeros_inteiros[i]);
        }

        System.out.println("");
        for(int i=0; i<par; i++){
            System.out.print(numeros_pares[i]);
        }

        System.out.println("");
        for(int i=0; i<impar; i++){
            System.out.print(numeros_impares[i]);
        }
   }
}
