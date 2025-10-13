package IntroducaoED.TAD_Numero.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero numero = new Numero();
        int resp = 0;

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("-- NUMERO TAD --");
            System.out.println("-> 0 ENCERRAR");
            System.out.println("-> 1 LER");
            System.out.println("-> 2 ATRIBUIR");
            System.out.println();

            resp = sc.nextInt();

            if(resp == 0){
                break;
            }else if(resp == 1){
                System.out.println(numero.get_valor());
            }else if(resp == 2){
                float v = sc.nextFloat();
                numero.regra_valor(v);
            }
        }
    }
}
