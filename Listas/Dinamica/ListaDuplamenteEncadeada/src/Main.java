package Listas.Dinamica.ListaDuplamenteEncadeada.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar elemento no final");
            System.out.println("2. Remover elemento");
            System.out.println("3. Buscar elemento por índice");
            System.out.println("4. Obter índice de um elemento");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Tamanho da lista");
            System.out.println("7. Verificar se lista está vazia");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para adicionar no final: ");
                    int valor = sc.nextInt();
                    lista.add(valor);
                    System.out.println(valor + " adicionado ao final da lista.");
                    break;

                case 2:
                    System.out.print("Digite o número para remover: ");
                    int remover = sc.nextInt();
                    try {
                        lista.remove(remover);
                        System.out.println(remover + " removido da lista.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice: ");
                    int buscarIndex = sc.nextInt();
                    try {
                        int elemento = lista.get(buscarIndex);
                        System.out.println("Elemento no índice " + buscarIndex + ": " + elemento);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Digite o elemento para obter o índice: ");
                    int elem = sc.nextInt();
                    try {
                        int idx = lista.indexOf(elem);
                        System.out.println("O índice do elemento " + elem + " é: " + idx);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println(lista.printList()); 
                    break;

                case 6:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;

                case 7:
                    System.out.println("Lista vazia? " + lista.isEmpty());
                    break;

                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 8);

        sc.close();
    }
}
