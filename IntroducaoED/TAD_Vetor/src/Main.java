package IntroducaoED.TAD_Vetor.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanho, max, min, vaga, repetir;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("CONFIGURACOES INICIAIS");
            System.out.println();

            System.out.println("qual o tamanho do vetor?");
            tamanho = sc.nextInt();
            if(tamanho <=0){
                System.out.println("tamanho invalido");
                continue;
            }

            System.out.println("qual o valor min: ");
            min = sc.nextInt();
            System.out.println("qual o valor max: ");
            max = sc.nextInt();
            if(min > max || min == max){
                System.out.println("minimo é maior que o maximo ou minimo e igual a max.");
                continue;
            }

            System.out.println("defina um valor para ser a posicao vaga:");
            vaga = sc.nextInt();
            if(vaga >= min && vaga <= max){
                System.out.println("vaga nao possui um valor valido.");
                continue;
            }

            System.out.println("digite 1 para poder repetir e 2 para nao poder.");
            repetir = sc.nextInt();
            if(repetir != 1 && repetir != 2){
                System.out.println("repetir invalido.");
                continue;
            }

            break;
        }

        Vetor v = new Vetor(min, max, vaga, repetir, tamanho);

        while(true){
            System.out.println("");
            System.out.println("MENU");
            System.out.println("0 -> Encerrar");
            System.out.println("1 -> Atribuir");
            System.out.println("2 -> Alterar");
            System.out.println("3 -> Rmover");
            System.out.println("4 -> Ler");
            System.out.println("5 -> Localizar");
            System.out.println("6 -> Inserir na primeira posicao");
            System.out.println("7 -> Remover da ultima posicao");
            System.out.println("8 -> Imprimir vetor");
            System.out.println("");

            int resp = sc.nextInt();
            if(resp == 0){
                break;
            }else if(resp == 1){
                System.out.println("digite um numero: ");
                int numero = sc.nextInt();
                System.out.println("|digite uma posicao: ");
                int posicao = sc.nextInt();
                v.atribuir(numero, posicao);
            }else if(resp == 2){
                System.out.println("digite um numero: ");
                int numero = sc.nextInt();
                System.out.println("digite uma posicao: ");
                int posicao = sc.nextInt();
                v.alterar(numero, posicao);
            }else if(resp == 3){
                System.out.println("digite uma posicao: ");
                int posicao = sc.nextInt();
                v.remover(posicao);
            }else if(resp == 4){
                System.out.println("digite uma posicao: ");
                int posicao = sc.nextInt();
                System.out.println(v.ler(posicao)); 
            }else if(resp == 5){
                System.out.println("digite um valor: ");
                int valor = sc.nextInt();
                int[] array = v.localizar(valor, 0);
                if(array[0] == 0){
                    System.out.println("valor nao encontrado.");
                }else{
                    String resposta = "[";
                    for(int i = 1; i<=array[0]; i++){
                        if(i != array[0]){
                            resposta += array[i] + ", ";
                        }else{
                            resposta += array[i];
                        }
                    }
                    resposta += "]";
                    System.out.println("o valor "+valor+" esta nos indices "+resposta);
                }
            }else if(resp == 6){
                System.out.println("digite um valor: ");
                int valor = sc.nextInt();
                v.adicionar_1posicao(valor);
            }else if(resp == 7){
                v.remover_Uposicao();
            }else if (resp == 8) {
                v.imprimir();
            }
        }
    }
}
