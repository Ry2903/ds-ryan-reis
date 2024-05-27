package ProjetoCarro_MyWay;
import java.util.*;

public class SistemaCarro {
    public static void main(String args[]){
    int Velocidade = 0;
    String brand, model, color, option;

    Scanner scan = new Scanner(System.in);

    System.out.println("Insira os dados do carro:");
    System.out.print("Marca: ");
    brand = scan.nextLine();

    System.out.print("Modelo: ");
    model = scan.nextLine();

    System.out.print("Cor: ");
    color = scan.nextLine();

    System.out.println("Velocidade atual: "+Velocidade+"km/h");

    System.out.print("Escolha uma opcão\nA- Acelerar (+10km/h)\nB- Freiar (-10km/h)\n\nOpção Selecionada: ");
    option = scan.nextLine();
    
    if (option == "A") {
        Velocidade = Velocidade + 10;
    }

    if (option == "B") {
        if (Velocidade < 0) {
            System.out.print("Não é possível frear: SEM VELOCIDADE!!!");
        } else if (Velocidade > 10) {
            Velocidade = Velocidade - 10;
        }
    }
    }
}
