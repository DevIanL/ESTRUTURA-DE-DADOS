package Revisao.LP1.ClassesEObjetos.Ex3.src;

public class Main {
    public static void main(String[] arg){
        ContaBancaria a = new ContaBancaria();
        ContaBancaria b = new ContaBancaria(2000);
        a.depositar(550);
        b.depositar(1000);
        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        b.sacar(4000);
        a.sacar(30);
        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
    }
}
