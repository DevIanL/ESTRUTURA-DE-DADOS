package Revisao.LP1.ClassesEObjetos.Ex4.src;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public Livro (){
        this("Titulo ", "Autor ", 2000);
    }

    public void set_dados(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String get_dados(){
        return "[Titulo: " + titulo + ", Autor: " + autor + ", Ano: " + ano + "]";
    }
}