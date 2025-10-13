package Revisao.ED.Unidade1.src;

public class Main {

    public static void main(String[] args){
        FilaEstatica fe1 = new FilaEstatica();
        FilaCircularEstatica fc1 = new FilaCircularEstatica();
        PilhaEstatica p1 = new PilhaEstatica();
        ListaCircularEstatica l1 = new ListaCircularEstatica();
        
        // PILHA
        System.out.println("_____________________PILHA_____________________");

        p1.imprimir_lista();
        
        p1.adicionar_elemento("A");
        p1.adicionar_elemento("B");
        p1.adicionar_elemento("C");
        p1.adicionar_elemento("D");
        p1.adicionar_elemento("E");
        p1.adicionar_elemento("F");
        p1.adicionar_elemento("G");
        p1.adicionar_elemento("H");
        p1.adicionar_elemento("I");
        p1.adicionar_elemento("J");
        p1.imprimir_lista();

        p1.atualizar_elemento("X");
        p1.imprimir_lista();

        p1.remover_elemento();
        p1.imprimir_lista();

        p1.esvaziar_lista();
        p1.imprimir_lista();

        p1.remover_elemento();

        p1.imprimir_lista();
        
        // FILA ESTATICA
        System.out.println("_____________________FILA ESTATICA_____________________");

        fe1.adicionar_elemento("A");
        fe1.adicionar_elemento("B");
        fe1.adicionar_elemento("C");
        fe1.adicionar_elemento("D");
        fe1.adicionar_elemento("E");
        fe1.adicionar_elemento("F");
        fe1.adicionar_elemento("G");
        fe1.adicionar_elemento("H");
        fe1.adicionar_elemento("I");
        fe1.adicionar_elemento("J");
        fe1.imprimir_lista();

        fe1.atualizar_elemento("X");
        fe1.imprimir_lista();
        fe1.ler_elemento();

        fe1.remover_elemento();
        fe1.remover_elemento();
        fe1.remover_elemento();
        fe1.adicionar_elemento("D");
        fe1.adicionar_elemento("E");
        fe1.adicionar_elemento("F");
        fe1.imprimir_lista();

        fe1.esvaziar_lista();
        fe1.imprimir_lista();

        fe1.remover_elemento();

        // FILA CIRCULAR
        System.out.println("_____________________FILA CIRCULAR_____________________");

        fc1.adicionar_elemento("A");
        fc1.adicionar_elemento("B");
        fc1.adicionar_elemento("C");
        fc1.adicionar_elemento("D");
        fc1.adicionar_elemento("E");
        fc1.adicionar_elemento("F");
        fc1.adicionar_elemento("G");
        fc1.adicionar_elemento("H");
        fc1.adicionar_elemento("I");
        fc1.adicionar_elemento("J");
        fc1.imprimir_lista();

        fc1.atualizar_elemento("X");
        fc1.adicionar_elemento("D");
        fc1.adicionar_elemento("E");
        fc1.adicionar_elemento("F");
        fc1.imprimir_lista();
        fc1.ler_elemento();

        fc1.remover_elemento();
        fc1.remover_elemento();
        fc1.remover_elemento();
        fc1.adicionar_elemento("D");
        fc1.adicionar_elemento("E");
        fc1.adicionar_elemento("F");
        fc1.imprimir_lista();

        fc1.esvaziar_lista();
        fc1.imprimir_lista();

        fc1.remover_elemento();

        // LISTA CIRCULAR
        System.out.println("_____________________FILA CIRCULAR_____________________");
        l1.imprimir_lista();

        l1.adicionar_elemento(0, "A");
        l1.imprimir_lista();

        l1.adicionar_elemento("B");
        l1.adicionar_elemento("C");  
        l1.adicionar_elemento("D");
        l1.adicionar_elemento("E");
        l1.imprimir_lista();

        l1.adicionar_elemento("F");

        l1. remover_elemento(0);
        l1.imprimir_lista();
        
        l1.adicionar_elemento(1, "X");
        l1.imprimir_lista();
    }
}
