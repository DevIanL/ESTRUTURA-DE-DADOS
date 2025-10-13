package Arrays.Lista1;

public class exer4 {                                                                                                    // Faça um programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. 
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};                                             // Vetor com letras diversas.
        int consoantes = 0;                                                                                             // Contador de consoantes.
    
        for(int i =0; i < letras.length; i++){

            if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u'){       // Assume-se que tudo que nao é uma vogal é uma consoante
            }else{
                consoantes ++;
            }
        }
        System.out.println(consoantes);
    }
}
