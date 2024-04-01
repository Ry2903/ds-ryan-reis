public class Metodos {
    static void meuMetodo() {
        System.out.println("Assim funciona um método");
    }
    //static define que esse metodo pertence a classe main e não é objeto

    static void meuMetodoComParametros (String nome, int idade) {
        System.out.println(nome+" tem "+idade);
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("Ryan", 16);
    }
}