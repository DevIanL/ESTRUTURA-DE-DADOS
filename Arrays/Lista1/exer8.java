package Arrays.Lista1;

public class exer8 {                                                                //Faça um programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
    public static void main (String[] arg){
        int[] idade = new int[5];                                                   //Cria um vetor com cinco posicoes para a idade.                          
        int[] altura = new int[5];                                                  //Cria um vetor com cinco posicoes para a altura.
        String idade_string = "[";
        String altura_string = "[";

        for(int i=0; i<altura.length; i++){                                         //Armazena os valores solicitados.
            idade[i] = Integer.parseInt(System.console().readLine(":"));
            altura[i] = Integer.parseInt(System.console().readLine(":"));
        }

        for(int i=altura.length -1 ; i>=0; i--){                                    //Guarda em ordem invertida.
            idade_string += idade[i] + " ";
            altura_string += altura[i] + " ";
        }

        idade_string += "]";
        altura_string += "]";

        System.out.println(idade_string);
        System.out.println(altura_string);
    }
}
