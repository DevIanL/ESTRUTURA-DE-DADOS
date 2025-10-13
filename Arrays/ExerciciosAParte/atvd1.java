package Arrays.ExerciciosAParte;

public class atvd1 {
    public static void main(String[] args) {
        int[] numeros_inteiros = new int[10];
        for(int i=0; i<10; i++){
            numeros_inteiros[i] = Integer.parseInt(System.console().readLine("Digite um numero inteiro: "));
        }

        for(int i=0; i<10; i++){
            if(numeros_inteiros[i] % 2 == 0){
                System.out.println(numeros_inteiros[i]);
            }
        }
    }
}
