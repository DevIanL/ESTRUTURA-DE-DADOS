package Pilhas.PilhaDinamicaDAOProject.src.app;

import Pilhas.PilhaDinamicaDAOProject.src.dao.CarDAO;
import Pilhas.PilhaDinamicaDAOProject.src.dao.CarDAOPilhaDinamica;
import Pilhas.PilhaDinamicaDAOProject.src.model.Car;
import java.util.Scanner;

public class CarService {

    public static CarDAO getPilhaDinamicaCarDAO(){
        return new CarDAOPilhaDinamica();
    }

    public static void main(String[] args) {
        CarDAO servicoCarro = CarService.getPilhaDinamicaCarDAO();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean verificacao = false;

        while (true) {
            System.out.println();
            System.out.println("SISTEMA SERVIÇO DE CARROS: ");
            System.out.println();
            System.out.println("1) ADICIONAR CARRO.");
            System.out.println("2) RETORNAR CARRO PELA PLACA.");
            System.out.println("3) RETORNAR ARRAY DE CARROS.");
            System.out.println("4) DELETAR CARRO PELA PLACA.");
            System.out.println();
            System.out.println("0) ENCERRAR.");
            System.out.println();

            opc = sc.nextInt();
            sc.nextLine();

            switch(opc){
                case 0:
                    break;

                case 1:
                    String placa = null;
                    String marca = null;
                    String modelo = null;
                    Car novoCarro = null;

                    do{
                        System.out.print("Digite a placa do veículo: ");
                        placa = sc.nextLine();
                        System.out.print("\nDigite a marca do veículo: ");
                        marca = sc.nextLine();
                        System.out.print("\nDigite o modelo do veículo: ");
                        modelo = sc.nextLine();
                        try{
                            novoCarro = new Car(placa, marca, modelo);
                            verificacao = true;

                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                            System.out.println();
                        }

                    }while(!verificacao);
                    
                    verificacao = false;

                    servicoCarro.addCar(novoCarro);
                    break;

                case 2:
                    String placa1 = null;  
                    Car carro = null;  

                    do {
                        System.out.print("Digite a placa do carro: ");
                        placa1 = sc.nextLine();
                        System.out.println();

                        try{
                            carro = servicoCarro.getCar(placa1);
                            verificacao = true;

                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            System.out.println();

                        }catch(RuntimeException e){
                            System.out.println(e.getMessage());
                            System.out.println();
                            break;
                        }

                    } while (!verificacao);
                        
                    if(carro == null){
                        break;
                    }

                    verificacao = false;

                    System.out.print("Carro encontrado:\n-> Marca: "+carro.getMark()+"\n-> Modelo: "+carro.getModel());
                    System.out.println();
                    break;

                case 3: 
                    Car[] arrayCarros = null;

                    try{
                        arrayCarros = servicoCarro.getAllCars();

                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                    String array = "";

                    for(int i=0; i<arrayCarros.length; i++){
                        if(i == arrayCarros.length -1){
                            array += arrayCarros[i];

                        }else{
                            array += arrayCarros[i] + ", ";
                        }
                    }

                    System.out.println("["+array+"]");
                    break;

                case 4:
                    String placa2 = null;  
                    Car carro1 = null;

                    do {
                        System.out.print("Digite a placa do carro: ");
                        placa2 = sc.nextLine();
                        System.out.println();

                        try{
                            carro1 = servicoCarro.deleteCar(placa2);
                            verificacao = true;

                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                            System.out.println();

                        }catch(RuntimeException e){
                            System.out.println(e.getMessage());
                            System.out.println();
                            break;
                        }

                    } while (!verificacao);
                    
                    verificacao = false;

                    if(carro1 == null){
                        break;
                    }

                    System.out.println("Carro: " + carro1.getMark() + ", " + carro1.getModel() + ". Placa: " + placa2 + " foi removido.");
                    System.out.println();
                    break;
            }
            
            if(opc == 0){
                sc.close();
                break;
            }
        }
    }
}
