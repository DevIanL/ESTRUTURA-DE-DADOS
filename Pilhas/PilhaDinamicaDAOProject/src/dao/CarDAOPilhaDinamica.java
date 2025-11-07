package Pilhas.PilhaDinamicaDAOProject.src.dao;

import Pilhas.PilhaDinamicaDAOProject.src.model.Car;
import java.time.LocalDateTime;
import Pilhas.PilhaDinamicaDAOProject.PilhaDinamicaGenerica.src.PilhaDinamica;

public class CarDAOPilhaDinamica implements CarDAO{
    private PilhaDinamica<Car> carros = new PilhaDinamica<>();

    // Operações básicas CRUD
    @Override
    public void addCar(Car car) {
        carros.empilhar(car);
    }

    @Override
    public Car getCar(String plateLicense) {
        Car retorno = null;

        if(!carros.isEmpty()){
            PilhaDinamica<Car> pilhaAuxiliar = new PilhaDinamica<>();
            PilhaDinamica<Car> pilhaAuxiliar2 = new PilhaDinamica<>();

            while(!carros.isEmpty()){
                if(carros.get().getLicensePlate().equals(plateLicense)){
                    retorno = carros.get();
                }
                
                pilhaAuxiliar.empilhar(carros.desempilhar());
            }

            while(!pilhaAuxiliar.isEmpty()){
                pilhaAuxiliar2.empilhar(pilhaAuxiliar.desempilhar());
            }

            carros = pilhaAuxiliar2;

            if(retorno == null){
                throw new IllegalArgumentException("Placa não encontrada.");
            }
        }else{
            throw new RuntimeException("Pilha de carros vazia.");
        }

        return retorno;
    }

    @Override
    public Car[] getAllCars() {
        Car[] arrayCarros = null;

        if(!carros.isEmpty()){
            int tamanho = 0;
            PilhaDinamica<Car> pilhaAuxiliar = new PilhaDinamica<>();
            
            while (!carros.isEmpty()) {
                pilhaAuxiliar.empilhar(carros.desempilhar());
                tamanho++;
            }

            arrayCarros = new Car[tamanho];

            while(!pilhaAuxiliar.isEmpty()) {
                arrayCarros[tamanho-1] = pilhaAuxiliar.get();
                carros.empilhar(pilhaAuxiliar.desempilhar());
                tamanho--;
            }
            
        }else{
            throw new RuntimeException("Pilha vazia.");
        }

        return arrayCarros;
    }

    @Override
    public void updateCar(Car newCar) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car deleteCar(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de consulta específicas para carros
    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByMark(String mark) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByModel(String model) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByColor(String color) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByOwner(String owner) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByMomentArrival(LocalDateTime initialMoment, LocalDateTime finalMoment) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de análise e estatísticas
    @Override
    public Car getCarByNewestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car getCarByOldestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de relatório e estatísticas
    @Override
    public String printCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getTotalCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularMark() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularModel() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularColor() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de gerenciamento
    @Override
    public boolean isCarInPlaced(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void clearAllCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void removeCarsOlderThan(LocalDateTime date) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByParkingDuration(long minHours, long maxHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getAvailableSpaces() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public boolean isParkingEmpty() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getMaxCapacity() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getOccupancyRate() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public boolean isParkingFull() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public long getParkingDuration(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void removeCarsByOwner(String owner) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public long getAverageArrivalTime() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsWithLongParking(long thresholdHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }
}
