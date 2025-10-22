public class Main {
    public static void main(String[] args) {
        try {
            Aluno a1 = new Aluno("123", "");
        } catch (FormatacaoMatriculaInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (FormatacaoSenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
