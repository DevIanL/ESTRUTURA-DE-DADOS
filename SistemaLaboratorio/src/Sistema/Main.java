package Sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Login lg = new Login();
        int opcao = 0;
        
        while (true) {
            System.out.println();
            System.out.println("------ SISTEMA LABORATÓRIO ------");
            System.out.println("--  1) Fazer Login             --");
            System.out.println("--  2) Fazer Cadastro          --");
            System.out.println("--                             --");
            System.out.println("--  0) Encerrar Programa       --");
            System.out.println("---------------------------------");
            System.out.println();

            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 0){
                break;

            }else if(opcao == 1){
                lg.logar(sc);

            }else if(opcao == 2){
                lg.cadastrar(sc);
                
            }
        }

        sc.close();
    }
}
