package Pilhas.Estatica.PilhaInvertida.src;

public class Main {
    public static void main(String[] args) {
        PilhaInvertida a = new PilhaInvertida();

        a.imprimir();
        a.empilhar("dado1");
        System.out.println(a.imprimir());
        a.empilhar("dado2");
        a.empilhar("dado3");
        a.empilhar("dado4");
        a.empilhar("dado5");
        a.empilhar("dado6");
        a.empilhar("dado7");
        a.empilhar("dado8");
        a.empilhar("dado9");
        a.empilhar("dado10");
        System.out.println(a.imprimir());
        a.empilhar("mais um");
        System.out.println(a.desempilhar());
        System.out.println(a.imprimir());
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
        a.desempilhar();
    }
}
