package Revisao.LP1.ClassesEObjetos.Ex2.src;

public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(){
        this(20,10);
    }

    public int area(){
        return (base*altura);
    }

    public int perimetro(){
        return (2*base + 2*altura);
    }
}
