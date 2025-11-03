package Excecoes;

public class FormatacaoTipoInvalidoException extends IllegalArgumentException{
    
    public FormatacaoTipoInvalidoException(String mensagem){
        super(mensagem);
    }
}
