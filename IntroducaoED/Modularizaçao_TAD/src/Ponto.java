package IntroducaoED.Modularizaçao_TAD.src;

public class Ponto implements PontoInterface{
    private double x;
    private double y;

    public Ponto(){
        this(10, 10);
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String ler_coordenadas(){
        return "Ponto x: " + x + "; Ponto y: " + y;
    }

    @Override
    public void atualizar_cordenadas(float x, float y){ 
        this.x = x;
        this.y = y;
    }

    @Override
    public double distancia_pontos(Ponto i, Ponto j){
        double dx = i.x - j.x;
        double dy = i.y - j.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double distancia_pontos(Ponto i){
        double dx = i.x - x;
        double dy = i.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
