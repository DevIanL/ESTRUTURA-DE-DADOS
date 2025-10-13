package Revisao.LP1.ClassesEObjetos.Ex1.src;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){
        this("Joao", 18);
    }

    public void dizer_oi(){
        System.out.println("Oi, me chamo " + nome + " e tenho " + idade + " anos");
    }

    public void aniversario(){
        idade ++;
    }
}
