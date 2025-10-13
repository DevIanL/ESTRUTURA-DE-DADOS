package src;

public class Aluno {
    private String nome;
    private int matricula;
    private float n1, n2, n3;

    public Aluno(){
        this("Ian",001,7,7,7);
    }

    public Aluno(String nome, int matricula, int n1, int n2, int n3){
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void set_dados(){
        System.out.println("Nome do aluno: ");
        nome = System.console().readLine();

        System.out.println("Matricula do aluno: ");
        matricula = Integer.parseInt(System.console().readLine());

        System.out.println("Nota 1 do aluno: ");
        n1 = Integer.parseInt(System.console().readLine());

        System.out.println("Nota 2 do aluno: ");
        n2 = Integer.parseInt(System.console().readLine());

        System.out.println("Nota 3 do aluno: ");
        n3 = Integer.parseInt(System.console().readLine());
    }

    public void get_dados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Media: "+ (n1+n2+n3)/3);
        System.out.println("");
    }
}
