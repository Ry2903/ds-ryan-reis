package aula03;

public class ExLoop {
    // Utilizando o laço de repetição no Java, faça com quew os 8 primeiros números da sequência de Fibonacci sejam calculados e exibidos!
    // Ex.: 0 1 1 2 3 5 8 13...

    //https://d138zd1ktt9iqe.cloudfront.net/media/seo_landing_files/fibonacci-formula-1618931842-1623683815.png

    public static void main (String[] args) {
        int fibo = 1, nacci = 0;

        System.out.println(nacci);
        System.out.println(fibo);
        for (int i = 0; i < 8; i++) {
            fibo = fibo + nacci;
            nacci = fibo - nacci;
            System.out.println(fibo);
        }
    }
}
