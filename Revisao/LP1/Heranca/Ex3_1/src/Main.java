package Revisao.LP1.Heranca.Ex3_1.src;

public class Main {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        ContaCorrente b = new ContaCorrente();
        ContaPoupanca c = new ContaPoupanca();

        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());

        System.out.println(a.depositar(1000));

        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());

        System.out.println(b.sacar(1500));

        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());

        System.out.println(a.sacar(2500));

        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());

        System.out.println(c.render(100));

        System.out.println(a.mostrar());
        System.out.println(b.mostrar());
        System.out.println(c.mostrar());
    }
}
