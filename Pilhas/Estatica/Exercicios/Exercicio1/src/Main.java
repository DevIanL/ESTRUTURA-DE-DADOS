package Pilhas.Estatica.Exercicios.Exercicio1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha p1;
        int tamanho = 0;
        int repetir = -1;

        while (true) {
            System.out.println("qual o tamanho da lista?");
            tamanho = sc.nextInt();
            if(tamanho <=0){
                System.out.println("tamanho invalido.");
                continue;
            }
            

            System.out.println("digite: 0 -> nao pode repetir, 1 -> pode repetir");
            repetir = sc.nextInt();
            if(repetir != 1 && repetir != 0){
                System.out.println("valor invalido.");
                continue;
            }
            break;
        }

        p1 = new Pilha(tamanho);
        p1.set_repetir(repetir);

        while (true) {
            System.out.println("MENU");
            System.out.println("0 -> ENCERRAR");
            System.out.println("1 -> INSERIR");
            System.out.println("2 -> REMOVER");
            System.out.println("3 -> RETORNAR QUATIDADE DE ELEMENTOS");
            System.out.println("4 -> INFORMAR O TOPO");
            System.out.println("5 -> LOCALIZAR A POSICAO DO ELEMENTO");
            System.out.println("6 -> IMPRIMIR");

            int opcao = sc.nextInt();
            if(opcao == 0){
                sc.close();
                break;
            }else if(opcao == 1){
                int e = sc.nextInt();
                p1.inserir(e);
            }else if(opcao == 2){
                System.out.println(p1.remover()); 
            }else if(opcao == 3){
                System.out.println(p1.get_elements()); 
            }else if(opcao == 4){
                System.out.println(p1.get_topo()); 
            }else if(opcao == 5){
                int e = sc.nextInt();
                System.out.println(p1.localizar_elemento(e));
            }else if (opcao == 6) {
                System.out.println(p1.imprimir()); 
            }
        }
    }
}
