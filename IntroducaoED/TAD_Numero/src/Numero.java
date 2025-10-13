package IntroducaoED.TAD_Numero.src;

public class Numero {
    private float valor;

    public Numero(){
        valor = 0;
    }

    public float get_valor(){
        return valor;
    }

    public void regra_valor(float a){
        if(a < 0){
            valor = 0;
        }else if(a > 40 && a <60){
            if(a < 50){
                valor = 40;
            }else{
                valor = 60;
            }
        }else if(a > 100){
            valor = 100;
        }else{
            valor = a;
        }
    }
}
