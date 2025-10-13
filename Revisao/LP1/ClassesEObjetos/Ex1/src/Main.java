package Revisao.LP1.ClassesEObjetos.Ex1.src;

public class Main {
    public static void main (String[] arg){
        Pessoa a = new Pessoa();
        Pessoa b = new Pessoa("Ana", 23);

        a.dizer_oi();
        b.dizer_oi();
        a.aniversario();
        b.aniversario();
        a.dizer_oi();
        b.dizer_oi();
    }
}
