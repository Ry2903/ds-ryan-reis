package Projeto_Carro;
public class Carro {
    private String Marca;
    private String Modelo;
    private String Cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String Modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = cor;
    }

    public String getCarro() {
        System.out.println("Seu carro é um "+modelo+", "+cor+" da marca: "+marca+"");
    }
}