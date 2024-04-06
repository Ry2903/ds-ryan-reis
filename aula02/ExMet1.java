public class ExMet1 {
    static void MetodoA (String x, String y) {
        if (x == y) {
            System.out.println("As palavras "+x+" e "+y+" são iguais");
        } else {
            System.out.println("As palavras "+x+" e "+y+" são diferentes");
        }
    }

    public static void main(String[] args) {
        MetodoA("Java", "Java");
    }    
}