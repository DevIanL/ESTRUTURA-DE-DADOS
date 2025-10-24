package Pilhas.Estatica.Exercicios.Exercicio2.src;

import java.util.Random;

public class Jogo {
    Random random = new Random();

    private Pilha a, b, c;

    public Jogo(Pilha a, Pilha b, Pilha c){
        for(int i=0; i<a.get_tamanho(); i++){
            int aleatorio = random.nextInt(10);
            int aleatorio1 = random.nextInt(10);
            a.adicionar(aleatorio);
            b.adicionar(aleatorio1);
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void transferirDaPilha1ParaPilha2(){
        if(b.get_qtd_elementos() != b.get_tamanho()){
            b.adicionar(a.remover());
        }
    }

    public void transferirDaPilha2ParaPilha1(){
        if(a.get_qtd_elementos() != a.get_tamanho()){
            a.adicionar(b.remover());
        }
    }

    public void transferirDaPilha1ParaPilha3(){
        if(c.get_qtd_elementos() != c.get_tamanho()){
            c.adicionar(a.remover());
        }      
    }

    public void transferirDaPilha3ParaPilha1(){
        if(a.get_qtd_elementos() != a.get_tamanho()){
            a.adicionar(c.remover());
        }
    }

    public void transferirDaPilha2ParaPilha3(){
        if(c.get_qtd_elementos() != c.get_tamanho()){
            c.adicionar(b.remover());
        }
    }

    public void transferirDaPilha3ParaPilha2(){
        if(b.get_qtd_elementos() != b.get_tamanho()){
            b.adicionar(c.remover());
        }
    }

    public void tela(){
        System.out.println("PILHA 1: "+ a.imprimir());
        System.out.println("PILHA 2: "+ b.imprimir());
        System.out.println("PILHA 3: "+ c.imprimir());
    }
}
