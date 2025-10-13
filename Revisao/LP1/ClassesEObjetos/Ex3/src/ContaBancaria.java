package Revisao.LP1.ClassesEObjetos.Ex3.src;

public class ContaBancaria {
    private double saldo;
    private int numero_da_conta;
    private static int contador = 1;
    
    public ContaBancaria(double saldo){
        this.saldo = saldo;
        numero_da_conta = contador;
        contador ++;
    }

    public ContaBancaria(){
        this(1000);
    }

    public String depositar(double deposito){
        saldo += deposito;
        return "Valor de " + deposito + "depositado.";
    }

    public String sacar(double saque){
        String retorno = "Valor sacado foi: " + saque;
        if(saque > saldo){
           retorno = "nao é possivel sacar este valor. ";
        }else{
            saldo -= saque;
        }
        return retorno;
    }

    public String mostrar(){
        return saldo +" "+ numero_da_conta;
    }
}
