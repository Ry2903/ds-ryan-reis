package aula04;
import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual seu nome?");
        String output = name + " nome bosta hein?!";
        JOptionPane.showMessageDialog(null, output);
    }
}