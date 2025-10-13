package IntroducaoED.Modularizaçao_TAD.src;

public class Main {
    public static void main(String[] args) {
        Ponto a = new Ponto();
        Ponto b = new Ponto();

        System.out.println(a.ler_coordenadas());
        System.out.println(b.ler_coordenadas());

        System.out.println(b.distancia_pontos(a, b));

        b.atualizar_cordenadas(20, 10);

        System.out.println(b.distancia_pontos(a, b));
        System.out.println(b.distancia_pontos(a));

        a.atualizar_cordenadas(0, 10);
        
        System.out.println(a.distancia_pontos(a, b));
        System.out.println(a.distancia_pontos(b));
    }
}
