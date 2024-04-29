
package aula04;
import javax.swing.*;

public class CalcIMC {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        String pes = JOptionPane.showInputDialog("Qual seu peso?");
        String altura = JOptionPane.showInputDialog("Qual sua altura");
        
        Float peso = Float.parseFloat(pes);
        Float alt = Float.parseFloat(altura);
        String classificacao ="";

        Float imc = peso/(alt*alt);
        if (imc <= 16.9) {
            classificacao = "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.4) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc >= 35 && imc <= 40) {
            classificacao = "Obesidade grau II";
        } else if (imc >= 40) {
            classificacao = "Obesidade grau III";
        }

        String output  = nome+" tem "+alt+"m e pesa "+peso+"kg.\nIMC = "+imc+"\nSua situação é: "+classificacao;
        JOptionPane.showMessageDialog(null, output);
    }
}
