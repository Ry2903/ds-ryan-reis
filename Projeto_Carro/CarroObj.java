package Projeto_Carro;
public class CarroObj {
    private String Marca;
    private String Modelo;
    private String Cor;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getCarro() {
        return("Seu carro é um "+Modelo+", "+Cor+" da marca: "+Marca+"");
    }
}