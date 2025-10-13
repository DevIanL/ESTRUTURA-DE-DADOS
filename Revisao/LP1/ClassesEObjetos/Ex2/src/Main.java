package Revisao.LP1.ClassesEObjetos.Ex2.src;

public class Main {
    public static void main (String[] arg){
        Retangulo a = new Retangulo();
        Retangulo b = new Retangulo(2,4);

        System.out.println(a.area());
        System.out.println(b.area());
        System.out.println(a.perimetro());
        System.out.println(b.perimetro());
    }
}
