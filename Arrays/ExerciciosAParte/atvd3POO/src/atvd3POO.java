package Arrays.ExerciciosAParte.atvd3POO.src;

public class atvd3POO {
    public static void main(String[] args) {
        int resp = 0;
        boolean r = true;
        int resp1 = 0;
        Pilha a = new Pilha();
        while (r) {  
            System.out.println("1 -> Empilhar");
            System.out.println("2 -> Desempilhar");
            System.out.println("3 -> Mostrar");
            System.out.println("0 -> Sair");  
            resp = Integer.parseInt(System.console().readLine("Digite o que quer que aconteça: "));
            if (resp == 1) {
                resp1 = Integer.parseInt(System.console().readLine("Digite o que quer empilhar: "));
                a.empilhar(resp1);
            }

            if (resp == 2) {
                System.out.println(a.desempilhar());
            }

            if(resp == 3){
               System.out.println(a.mostrar());
            }

            if (resp == 0) {
                r = false;              
            }
        }
    }
}
