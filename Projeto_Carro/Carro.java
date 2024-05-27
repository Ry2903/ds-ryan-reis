package Projeto_Carro;

public class Carro {
    public static void main(String[] args) {
        CarroObj car;
        
        car = new CarroObj();
        
        car.setMarca("Chevrolet");
        System.out.println(car.getMarca());

        car.setModelo("Tracker");
        System.out.println(car.getModelo());

        car.setRodas(4);
        System.out.println(car.getRodas());

        car.setPortas(4);
        System.out.println(car.getPortas());

        System.out.println(car.getCarro());
    }
}
