package IntroducaoED.TAD_Modularizacao.src;

public interface PontoInterface {
    void atualizar_cordenadas(float x, float y);
    String ler_coordenadas();
    double distancia_pontos(Ponto i, Ponto j);
    double distancia_pontos(Ponto i);
}
