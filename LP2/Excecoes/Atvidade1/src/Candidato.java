package LP2.Excecoes.Atvidade1.src;

public class Candidato {
    private int numero; // número do candidato
    private String nome; // nome do candidato
    private int idade; // idade do candidato
    private String cargo; // cargo (vereador, prefeito, deputado, governador, sem. ou pres.)
    private int votos; // quantidade de votos até então recebidos pelo candidato

    // construtor
    public Candidato(int numero, String nome, int idade, String cargo) throws IllegalArgumentException {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        // inicialização de votos até então recebidos pelo candidato
        this.votos = 0;

        if (!cargo.equalsIgnoreCase("presidente")   &&
            !cargo.equalsIgnoreCase("senador")      &&
            !cargo.equalsIgnoreCase("governador")   &&
            !cargo.equalsIgnoreCase("deputado")     &&
            !cargo.equalsIgnoreCase("prefeito")     &&
            !cargo.equalsIgnoreCase("vereador")) {
            
                throw new IllegalArgumentException("Não existe o cargo de: " + cargo);
        }

        if (idade < 18) {
            throw new IllegalArgumentException("Com " + idade + " anos nao é possivel se candidatar.");
        }else if (idade < 21 && (!cargo.equalsIgnoreCase("vereador"))) {
            throw new IllegalArgumentException("Nao e possivel ser " + cargo + " com " + idade + " anos.");
        }else if (idade < 30 && (!cargo.equalsIgnoreCase("vereador") && !cargo.equalsIgnoreCase("deputado") && !cargo.equalsIgnoreCase("prefeito"))){
            throw new IllegalArgumentException("Nao e possivel ser " + cargo + " com " + idade + " anos.");
        }else if (idade < 35 && (!cargo.equalsIgnoreCase("vereador") && !cargo.equalsIgnoreCase("deputado") && !cargo.equalsIgnoreCase("prefeito") && !cargo.equalsIgnoreCase("governador"))){
            throw new IllegalArgumentException("Nao e possivel ser " + cargo + " com " + idade + " anos.");
        }
    }

    // métodos getter
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public int getVotos() {
        return votos;
    }

    // incremento, em 1 (uma) unidade, de votos até então recebidos pelo candidato
    public void adicionarVoto() {
        this.votos++;
    }
}
