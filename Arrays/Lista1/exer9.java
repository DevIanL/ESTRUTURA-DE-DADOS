package Arrays.Lista1;

public class exer9 {
    public static void main(String[] args) {
        int somatorio = 0;
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for(int i = 0; i <10; i++){
            somatorio += vetor[i] * vetor[i];
        }
        
        System.err.println(somatorio);
    }
}
