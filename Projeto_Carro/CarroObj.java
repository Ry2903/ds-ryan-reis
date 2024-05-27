package Projeto_Carro;
public class CarroObj {
    private String Marca;
    private String Modelo;
    private int Rodas;
    private int Portas;

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

    public String getRodas() {
        return Rodas;
    }

    public void setRodas(int Rodas) {
        this.Rodas = Rodas;
    }

    public String getPortas() {
        return Portas;
    }

    public void setPortas(int Portas) {
        this.Portas = Portas;
    }

    public String getCarro() {
        return("Seu carro é um "+Modelo+" ("+Marca+"); Rodas: "+Rodas+"; Portas: "+Portas+".");
    }
}