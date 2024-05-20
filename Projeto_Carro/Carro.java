package Projeto_Carro;
import javax.swing.*;
public class Carro {
    public static void main(String[] args) {
        CarroObj Carro1;
        
        Carro1 = new CarroObj ();
        
        String Brand = JOptionPane.showInputDialog("Qual a marca do seu carro?");
        Carro1.setMarca (Brand);
        System.out.println(Carro1.getMarca());
        
        String Model = JOptionPane.showInputDialog("Qual o modelo do seu carro?");
        Carro1.setModelo (Model);
        System.out.println(Carro1.getModelo());

        String Color = JOptionPane.showInputDialog("Qual a cor do seu carro?");
        Carro1.setCor (Color);
        System.out.println(Carro1.getCor());
        
        System.out.println(Carro1.getCarro());
    }

    public static void (String[] args){

    }
}
