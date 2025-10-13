package Revisao.LP1.ClassesEObjetos.Ex4.src;

public class Main {
    public static void main(String[] args) {
        Livro a = new Livro();
        System.out.println(a.get_dados());

        a.set_dados("O dialogo dos susurros", "Lucas", 2025);
        System.out.println(a.get_dados());
    }
}
