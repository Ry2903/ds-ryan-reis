package aula04;
import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        int fibo = 1, nacci = 0;

        JOptionPane.showMessageDialog(null, nacci);
        JOptionPane.showMessageDialog(null, fibo);
        for (int i = 0; i < 8; i++) {
            fibo = fibo + nacci;
            nacci = fibo - nacci;
            JOptionPane.showMessageDialog(null, fibo);
        }
    }
}
