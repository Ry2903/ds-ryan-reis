package Projeto_Carro;
import javax.swing.*;

public class InterfaceCarro {
    public static void main(String[] args) {
        Carro InterfaceCarro;
        
        carro1 = new Carro ();
        
        String Brand = JOptionPane.showInputDialog("Qual a marca do seu carro?");
        carro1.setMarca (Brand);
        System.out.println(carro1.getMarca());
        
        String Model = JOptionPane.showInputDialog("Qual o modelo do seu carro?");
        carro1.setModelo (Model);
        System.out.println(carro1.getModelo());

        String Color = JOptionPane.showInputDialog("Qual a cor do seu carro?");
        carro1.setCor (Color);
        System.out.println(carro1.getCor());
        
        System.out.println(carro1.getCarro());
    }
}