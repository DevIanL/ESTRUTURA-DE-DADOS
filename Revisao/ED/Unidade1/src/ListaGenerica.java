package Revisao.ED.Unidade1.src;

public abstract class ListaGenerica {

    abstract void adicionar_elemento(Object a);
    abstract Object ler_elemento();
    abstract void imprimir_lista();
    abstract Object atualizar_elemento(Object a);
    abstract Object remover_elemento();
    abstract boolean esta_cheia();
    abstract boolean esta_vazia();
    abstract void esvaziar_lista();
}