package Filas.FilaEstatica.src;

public class Main {
    public static void main(String[] arg){
        FilaEstatica a = new FilaEstatica();

        System.out.println(a.imprimir());

        a.enfileirar("a");  
        System.out.println(a.imprimir());

        a.enfileirar("b");  
        a.enfileirar("c");  
        a.enfileirar("d");  
        a.enfileirar("e");  
        a.enfileirar("f");  
        a.enfileirar("g");  
        a.enfileirar("h");  
        a.enfileirar("i");  
        a.enfileirar("j");  
        System.out.println(a.imprimir());

        a.enfileirar("k");

        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());
        System.out.println(a.desenfileirar());

        System.out.println(a.imprimir());

    }
}
