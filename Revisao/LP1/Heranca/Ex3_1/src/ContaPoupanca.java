package Revisao.LP1.Heranca.Ex3_1.src;

public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(){
       super();
    }

    public String render(double taxa){
        saldo += saldo*(taxa/100);
        return "Rendeu " + taxa + "%";
    }
}
