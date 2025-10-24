package Pilhas.Estatica.PilhaDupla.src;

public class Main {
    public static void main(String[] arg){
        PilhaDupla a = new PilhaDupla();

        a.empilhar_pilha1("Pablo");
        System.out.println(a.imprimir_pilha1());

        a.empilhar_pilha2("Pablo");
        System.out.println(a.imprimir_pilha2());

        a.desempilhar_pilha1();
        System.out.println(a.imprimir_pilha1());
        
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        a.empilhar_pilha1("Ian");
        System.out.println(a.imprimir_pilha1());

        a.empilhar_pilha2("Pablo");
        a.desempilhar_pilha1();
        a.empilhar_pilha2("Pablo");
        System.out.println(a.imprimir_pilha2());

    }
}
