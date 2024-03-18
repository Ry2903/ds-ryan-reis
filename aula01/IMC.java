import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner nome1 = new Scanner(System.in);
        String nome;
        Scanner peso1 = new Scanner(System.in);
        Float peso;
        Scanner alt1 = new Scanner(System.in);
        Float alt;

        System.out.println("Insira seu nome:");
        nome = nome1.nextLine();

        System.out.println("Insira seu peso (em KG):");
        peso = peso1.nextFloat();

        System.out.println("Insira sua altura (em CM):");
        alt = alt1.nextFloat();

        System.out.println(nome, " tem ", alt,"cm de altura e pesa ", peso,"kg. Sua situação é xxx");

    }
}
