package Filas.FilaCircularEstatica.src;

public class Main {
    public static void main(String[] args) {
        FilaCircularEstatica fc1 = new FilaCircularEstatica();

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
    }
    
}
