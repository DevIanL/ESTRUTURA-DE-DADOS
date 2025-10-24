package Pilhas.Estatica.Exercicios.Exercicio2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha p1 = new Pilha();
        Pilha p2 = new Pilha();
        Pilha p3 = new Pilha();
        
        Jogo j1 = new Jogo(p1, p2, p3);

        while (true) {
            j1.tela();
            System.out.println();
            System.out.println("TRANSFERIR: ");
            System.out.println("1) DA PILHA 1 PARA A PILHA 2");
            System.out.println("2) DA PILHA 2 PARA A PILHA 1");            
            System.out.println("3) DA PILHA 1 PARA A PILHA 3"); 
            System.out.println("4) DA PILHA 3 PARA A PILHA 1");
            System.out.println("5) DA PILHA 2 PARA A PILHA 3");
            System.out.println("6) DA PILHA 3 PARA A PILHA 2");
            System.out.println("0) ENCERRAR");
            System.out.println();     
            
            int opcao = sc.nextInt();
            
            if(opcao == 0){
                sc.close();
                break;
            }else if(opcao == 1){
                j1.transferirDaPilha1ParaPilha2();
            }else if(opcao == 2){
                j1.transferirDaPilha2ParaPilha1();
            }else if(opcao == 3){
                j1.transferirDaPilha1ParaPilha3();
            }else if(opcao == 4){
                j1.transferirDaPilha3ParaPilha1();
            }else if(opcao == 5){
                j1.transferirDaPilha2ParaPilha3();
            }else if(opcao == 6){
                j1.transferirDaPilha3ParaPilha2();
            }
        }
    }
}
