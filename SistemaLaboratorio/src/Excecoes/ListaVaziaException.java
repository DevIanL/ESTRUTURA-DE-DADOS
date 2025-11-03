package Excecoes;

public class ListaVaziaException extends RuntimeException{
    
    public ListaVaziaException(String mensagem){
        super(mensagem);
    }
}
