package LP2.Excecoes.Atvidade1.src;

public class Main {
    public static void main (String[] args) {
        try{
            int numero = 1000;
            String nome = "Joao";
            int idade = 29;
            String cargo = "prefeito";

            Candidato a = new Candidato(numero, nome, idade, cargo);
            Candidato b = new Candidato(1100, "Ian", 21, "prefeito");
            Candidato c = new Candidato(1234, "Caio", 40, "prefeito");

            EleicaoPrefeito x = new EleicaoPrefeito(a, b, c);

            x.registrarVoto(1000);
            x.registrarVoto(1000);

            System.out.println(a.getVotos());

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
