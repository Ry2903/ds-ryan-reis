package aula02;

public class ExMet {
    static void MetodoA (String x, String y) {
        if (x == y) {
            System.out.println("As palavras "+x+" e "+y+" são iguais");
        } else {
            System.out.println("As palavras "+x+" e "+y+" são diferentes");
        }
    }

    static void MetodoB(String frase, String palavra) {
        if (frase.contains(palavra)) {
            System.out.println("A frase: '"+frase+"' contem a palavra '"+palavra+"'.");
        } else {
            System.out.println("A frase: '"+frase+"' nao contem a palavra '"+palavra+"'.");
        }
    }

    public static void main(String[] args) {
        MetodoA("Java", "Java");
        MetodoB("Eu sou um desenvolvedor senhora", "desenvolvedor");
    }    
}