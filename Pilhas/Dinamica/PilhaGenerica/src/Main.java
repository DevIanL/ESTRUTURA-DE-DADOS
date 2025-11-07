package Pilhas.Dinamica.PilhaGenerica.src;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        PilhaDinamica<Integer> p1= new PilhaDinamica<>();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (true) {
            System.out.println();
            System.out.println("PILHA: ");
            System.out.println(p1.imprimir());
            System.out.println();
            System.out.println("1) ADICIONAR.");
            System.out.println("2) REMOVER.");
            System.out.println("3) GERAR ARRAY DA PILHA.");
            System.out.println("4) ATUALIZAR.");
            System.out.println("5) RETORNAR TOPO.");
            System.out.println();
            System.out.println("0) ENCERRAR.");

            opcao = sc.nextInt();

            switch (opcao) {
                case 0: 
                    sc.close();      
                    break;

                case 1:
                    System.out.println("Digite um numero: ");
                    int numero = sc.nextInt();

                    p1.empilhar(numero);
                    break;

                case 2:
                    p1.desempilhar();
                    break;

                case 3: 
                    Object[] array = p1.toArray();

                    for(int i=0; i < array.length; i++){
                        if(i == array.length -1){
                            System.out.print(array[i]);
                        }else{
                            System.out.print(array[i]+ ", ");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Digite um numero: ");
                    int numero1 = sc.nextInt();

                    p1.atualizar(numero1);   
                    break;

                case 5: 
                    System.out.println(p1.get());
                    break;
            }
        }
    }
}
