package Sistema;

import EstrutrurasDados.ListaEncadeada.ListaEncadeada;
import java.util.Scanner;

public class Login {
    private ListaEncadeada<Usuario> listaLogin;

    public Login(){
        listaLogin = new ListaEncadeada<>();
    }

    public boolean verificarUsuario(String a){
        int aux = 0;
        
        for(Usuario i : listaLogin){
            if(a.equals(i.getMatricula())){
                aux++;
            }
        } 

        return aux == 0;
    }

    public Usuario logar(Scanner sc){
        Usuario usuario = null;
        String matricula = null;
        String senha = null;

        System.out.print("Sua Matricula: ");
        matricula = sc.nextLine();
        System.out.print("\nSua Senha: ");
        senha = sc.nextLine();

        if(listaLogin.isEmpty()){
            System.out.println("Senha ou Usuario invalido.");
        }

        if(!verificarUsuario(matricula)){
            for(Usuario a : listaLogin){
                if(matricula.equals(a.getMatricula())){
                    if(senha.equals(a.getSenha())){
                        usuario = a;
                        System.out.println("Logado com sucesso.");
                        break;
                    }else{
                        System.out.println("Senha ou Usuario invalido.");
                        break;
                    }
                }
            }
        }else{
            System.out.println("Senha ou Usuario invalido.");
        }

        return usuario;
    }
    

    public void cadastrar(Scanner sc){
        Usuario usuario = null;
        String matricula = null;
        String senha = null;
        String tipo = null;

        System.out.print("\nTipo da conta: (Aluno/Professor/Administrador) ");
        tipo = sc.nextLine().toLowerCase();

        switch (tipo) {
            case "aluno":
                System.out.print("Sua Matricula: ");
                matricula = sc.nextLine();
                System.out.print("\nCrie uma senha: (Deve conter: Letra Maiuscula; Numero; Caracter especial(!@#$%&*); Pelo menos 8 caracteres.) ");
                senha = sc.nextLine();

                usuario = new Aluno(matricula, senha);
                break;
        
            case "professor": 
                System.out.print("Sua Matricula: ");
                matricula = sc.nextLine();
                System.out.print("\nCrie uma senha: (Deve conter: Letra Maiuscula; Numero; Caracter especial(!@#$%&*); Pelo menos 8 caracteres.) ");
                senha = sc.nextLine(); 

                usuario = new Professor(matricula, senha);
                break;
                
            case "administrador":
                System.out.print("Sua Matricula: ");
                matricula = sc.nextLine();
                System.out.print("\nCrie uma senha: (Deve conter: Letra Maiuscula; Numero; Caracter especial(!@#$%&*); Pelo menos 8 caracteres.) ");
                senha = sc.nextLine();

                usuario = new Administrador(matricula, senha);
                break;

            default:
                System.out.println("Tipo invalido");
        }

        if (verificarUsuario(usuario.getMatricula())) {
            listaLogin.add(usuario);
        }else{
            System.out.println("Usuario ja existe.");
        }
    }
}
