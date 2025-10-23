package Listas.Dinamica.ListaEncadeada.src;

public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> l1 = new ListaLigada<>();

        l1.adicionar(1);
        l1.adicionar(2);
        l1.adicionar(3);
        l1.adicionar(4);
        l1.adicionar(5);
        l1.adicionar(6);
        l1.adicionar(7);
        System.out.println(l1.imprimir());

        l1.remover(4);
        System.out.println(l1.imprimir());
    }
}
