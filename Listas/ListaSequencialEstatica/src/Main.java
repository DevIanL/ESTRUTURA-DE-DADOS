package src;

public class Main {
    public static void main(String[] agrs){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Caio", 002, 7, 8, 9);
        Aluno a3 = new Aluno("Ricardo", 002, 9, 6, 10);
        Aluno a4 = new Aluno("Matheus", 003, 10,10,9);
        ListaEstatica l1 = new ListaEstatica();

        l1.adicionar_item_fim(a1);
        l1.adicionar_item_fim(a2);
        l1.adicionar_item_meio(1,a3);
        l1.adicionar_item_inicio(a4);

        l1.imprimir();

        l1.remover_item_meio(1);
        l1.imprimir(); 

        l1.remover_item_inicio();
        l1.imprimir();

        l1.remover_item_fim();
        l1.imprimir();

    }
}
