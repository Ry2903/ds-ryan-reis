import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        Float peso;
        Float altCM;

        Float imc;

        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Insira seu peso (em KG): ");
        peso = scanner.nextFloat();

        System.out.print("Insira sua altura (em CM): ");
        altCM = scanner.nextFloat();

        Float altM = altCM / 100.0f;

        imc = peso / (altM * altM);
        System.out.println("Seu IMC é: "+imc);
        
        if (imc <= 16.9) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é MUITO ABAIXO DO PESO");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é ABAIXO DO PESO");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é PESO NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é ACIMA DO PESO");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é OBESIDADE GRAU I");
        } else if (imc >= 35 && imc <= 40) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é OBESIDADE GRAU II");
        } else if (imc >= 40) {
            System.out.println(nome+" tem "+altM+"m de altura e pesa "+peso+"kg. Sua situação é OBESIDADE GRAU III");
        }
    }
}
