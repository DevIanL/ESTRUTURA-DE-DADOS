package Arrays.ExerciciosAParte;

public class atvd3 {
    public static void main(String[] arg){
        int[] pilha = new int[5];
        int topo = -1;
        int resp = 0;
        boolean r = true;

        System.out.println("1 -> Empilhar");
        System.out.println("2 -> Desempilhar");
        System.out.println("3 -> Mostrar");
        System.out.println("0 -> Sair");
        while (r) {    
            resp = Integer.parseInt(System.console().readLine("Digite o que quer que aconteça: "));
            if (resp == 1) {
                if (topo == 4/*tamanho - 1*/) {
                    System.out.println("Esta cheia");
                }else{
                    topo ++;
                    pilha[topo] = Integer.parseInt(System.console().readLine("Insira o elemento do topo:"));
                }
            }

            if (resp == 2) {
                if (topo == -1) {
                    System.out.println("A pilha esta vazia");
                }else{
                    System.out.println(pilha[topo]);
                    topo --;
                }
            }

            if(resp == 3){
                for(int i=topo; i>=0; i--){
                    System.out.print(pilha[i]);
                }
                System.out.println("");
            }

            if (resp == 0) {
                r = false;              
            }
        }
    }
}
